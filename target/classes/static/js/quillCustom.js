/**
テキストエディタの生成(中身空)
引数１： 作成する場所のid
戻り値： Quillエディタの生成情報
*/

// 参考
// http://sashimistudio.site/quilljs/

function QuillEditorMake(make_id) {
 
    var toolbarOptions; // ツールバーの機能設定
    var quill; // エディタ情報
    var themes = set_themes(); // エディタのテーマ（snow , bubble）
 
    // ツールバー機能の設定
    toolbarOptions = [
        //見出し
        [{
            'header': [1, 2, 3, 4, 5, 6, false]
        }],
       
        //太字、斜め、アンダーバー
        ['bold', 'italic', 'underline'],
        //文字色
        [{
                'color': []
            },
            //文字背景色
            {
                'background': []
            }
        ],
        //画像挿入
        ['image'],
        //URLリンク
        ['link'],
        //コードブロック
        ['code-block']
    ];
 
    //渡ってきたID名に「#」をくっつける
    make_id = '#' + make_id;
 
    //エディタの情報を生成
    quill = new Quill(make_id, {
        modules: {
            //ツールバーの設定
            toolbar: toolbarOptions
        },
        placeholder: 'とりあえず手を動かそうぜ',
        //ツールバーのあるデザイン
        theme: themes //'snow' or 'bubble'
    });
 
    return quill;
}
 
 
 
// テーマ設定（PCとスマホで切り替える画面幅で判定）
function set_themes() {
    var themes;
    if (window.parent.screen.width > 800) {
        themes = "snow";
    } else {
        themes = "bubble";
    }
    return themes;
}