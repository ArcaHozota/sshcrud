package jp.co.toshiba.ppok.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 共通メッセージクラス
 *
 * @author Administrator
 * @since 2023-07-28
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Messages {

	public static final String MSG001 = "拡張メッセージコンバーターの設置は完了しました。";

	public static final String MSG002 = "静的リソースのマッピングが開始しました。";

	public static final String MSG003 = "アプリは正常に起動しました!";

	public static final String MSG004 = "入力した都市名が重複する。";

	public static final String MSG005 = "入力した都市名は4桁から23桁までのローマ字にしなければなりません。";

	public static final String MSG006 = "^[a-zA-Z-\\\\p{IsWhiteSpace}]{4,17}$";

	public static final String MSG007 = "visible";

	public static final String MSG008 = "removed";

	public static final String MSG009 = "システムエラー";

	public static final String MSG010 = "更新済み";

	public static final String MSG011 = "追加済み";

	public static final String MSG012 = "変更なし";

	public static final String MSG013 = "削除済み";
}
