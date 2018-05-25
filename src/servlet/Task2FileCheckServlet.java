package servlet;

/**
 * ファイルの読み込み、ファイルの中身を引き出せる状態にするServlet
 * */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Task2LoginBean;

/*
 * csvファイルを読み込むクラス
 * */
public class Task2FileCheckServlet extends HttpServlet {
	private String fileName;
	//private Integer num;  //ネットから拾ったコード用

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		/*
		 * loginIdが入っているかチェック。
		 * Idが消えた場合ログイン場面に戻す。
		 * */
		if (req.getParameter("loginId") == null) {
			req.getRequestDispatcher("/task2Login.jsp").forward(req, res);
		}
		//セッションの開始
		HttpSession session = req.getSession(true);
		/*
		 * loginIdの初期化用
		 * LoginBean内のsetLoginIdにてIdをnullで初期化させる。
		 * */
		Task2LoginBean loginIdDelete = new Task2LoginBean();
		loginIdDelete.setLoginId(null);
		session.setAttribute("loginId", loginIdDelete);
		/*
		 * ファイル読み込み処理
		 *
		 * 受け取ったパスをString型のfileNameに代入
		 *このfileNameからfile型のfileを作成。
		 *「FileReaderを"file"を引数にして実行したもの」を
		 *BufferedReader型のreaderに入れる。
		 *(while文内容)
		 *読み込み処理時、1行ごと読み込んだものを入れる変数lineと、
		 *読み込んだものを入れる変数fileDataを宣言。
		 *読み込む行が空行になるまでfileDataに追記していく。
		 * */
		fileName = req.getParameter("pass");//C:\pleiades\workspace\jspServletTraining\WebContent\WEB-INF\data.csv
		File file = new File(fileName);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		String fileData = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line); //（デバッグ）読み込み内容の確認用。内容をコンソールに表示。
			fileData += line;
		}
		//List<List<String>> fileData = read(fileName);  //ネットから拾ったコード用
		/*
		 * 読み込んだfileDataを"fileData"というタグでResultのjspに送る。
		 * */
		req.setAttribute("fileData", fileData);
		req.getRequestDispatcher("/task2Result.jsp").forward(req, res);
	}
	//  ネットから拾ったコード
	//	/*
	//	 * csvファイルの読み込みを実行する
	//	 * @return
	//	 * */
	//	public List<List<String>> read(String fileName) {
	//		//入力チェック
	//		this.num = 0;
	//		if (this.fileName == null || this.num == null) {
	//			return null;
	//		}
	//		//返却用リスト箱作成
	//		List<List<String>> ret = new ArrayList<List<String>>();
	//		File csv = new File(fileName);//csvデータファイル
	//		BufferedReader br = null;
	//
	//		try {
	//			//ファイルオープン
	//			br = new BufferedReader(new FileReader(csv));  //教科書のreaderの役割
	//			//num行読み込む（0の場合は全行）
	//			String line = "";
	//			int idx = 0;
	//			while ((line = br.readLine()) != null) {
	//				//1行を格納する箱作成
	//				List<String> tmpList = new ArrayList<String>();
	//				//文字列index
	//				int idxFrom = 0;
	//				int idxTo = 0;
	//				//文字列長
	//				while (true) {
	//					//最終項目を取得後は終了
	//					if (idxFrom > line.length()) {
	//						break;
	//					}
	//					//次のセパレータ位置を取得
	//					idxTo = line.indexOf(",", idxFrom);
	//					//セパレータが発見できない場合は最終項目を取得
	//					if (idxTo == -1) {
	//						idxTo = line.length();
	//					}
	//					//文字列取得
	//					String word = line.substring(idxFrom, idxTo);
	//					//文字列を格納
	//					tmpList.add(word);
	//					//検索開始位置を更新
	//					idxFrom = idxTo + 1;
	//				}
	//				//返却用リストに1行データを格納
	//				ret.add(tmpList);
	//				//カウンタ
	//				if (idx % 1000 == 0) {
	//					System.out.println("入力：" + idx + "件");
	//				}
	//				idx++;
	//				//numを超えたら読み込み終了。numが0のときは全量読む。
	//				if (num != 0 && idx > num) {
	//					break;
	//				}
	//			}
	//		} catch (FileNotFoundException e) {
	//			e.printStackTrace();
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		} finally {
	//			try {
	//				if (br != null) {
	//					br.close();
	//				}
	//			} catch (IOException e) {
	//				e.printStackTrace();
	//			}
	//		}
	//		return ret;
	//	}
}
