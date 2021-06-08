package com.fridayof1995.sample


import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.fridayof1995.sample.WebView.*
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : androidx.fragment.app.Fragment() {


    private var fragmentNumber by FragmentArgumentDelegate<Number>()

    companion object {
        fun newInstance(fragmentNumber: Number) = MainFragment().apply {
            this.fragmentNumber = fragmentNumber
        }
    }

    @SuppressLint("WrongViewCast")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_main, container, false)
        val backdropCard: RelativeLayout = view.findViewById(R.id.backdropCard) as RelativeLayout
        val coding: LinearLayout = view.findViewById(R.id.coding) as LinearLayout
        val quiz: LinearLayout = view.findViewById(R.id.quiz) as LinearLayout
        val information: RelativeLayout = view.findViewById(R.id.information) as RelativeLayout
        val community: LinearLayout = view.findViewById(R.id.community) as LinearLayout
        val btn_C: Button = view.findViewById(R.id.btn_C) as Button
        val btn_qna: Button = view.findViewById(R.id.btn_qna) as Button
        val btn_python: Button = view.findViewById(R.id.btn_python) as Button
        val btn_Cs: Button = view.findViewById(R.id.btn_Cs) as Button
        val btn_Cpp: Button = view.findViewById(R.id.btn_Cpp) as Button
        val btn_java: Button = view.findViewById(R.id.btn_java) as Button
        val btn_hash: ImageButton = view.findViewById(R.id.btn_hash) as ImageButton
        val btn_stackq: ImageButton = view.findViewById(R.id.btn_stackq) as ImageButton

        // 공지사항 제목과 내용
        var btn_noticeUpdate: Button = view.findViewById(R.id.btn_noticeUpdate) as Button;
        var notice_title: TextView = view.findViewById(R.id.Notice_title) as TextView;
        var notice_content: TextView = view.findViewById(R.id.Notice_content) as TextView;

        //지정된 레이아웃 창이 아닐때에 보이지않게함
        if (fragmentNumber == 2 ){
            backdropCard.visibility = View.INVISIBLE
        }
        if (fragmentNumber != 1){
            coding.visibility = View.GONE
        }
        if (fragmentNumber != 0){
            quiz.visibility = View.GONE
        }
        if (fragmentNumber != 3){
            community.visibility = View.GONE
        }
        if (fragmentNumber != 4){
            information.visibility = View.GONE
        }

        // 공지사항 제목과 내용 취득
        // notice_title.text = NoticeBoard.GetTitle();
        // notice_content.text = NoticeBoard.GetContent();

        // 웹뷰(질문게시판 이동)
        btn_qna.setOnClickListener {
            val intent = Intent(context, WebView::class.java)
            startActivity(intent)
        }



        //퀴즈 정답 유무버튼
        btn_hash.setOnClickListener{
            val intent = Intent(context, HashActivity::class.java)
            startActivity(intent)}
        btn_stackq.setOnClickListener{
            val intent = Intent(context, HashActivity::class.java)
            startActivity(intent)}

        //코드실행기 버튼클릭시 각 버튼에 맞는 url로 접속
        btn_C.setOnClickListener{
            val intent = Intent(context, C::class.java)
            startActivity(intent)}
        btn_python.setOnClickListener{
            val intent = Intent(context, Python::class.java)
            startActivity(intent)}
        btn_Cs.setOnClickListener{
            val intent = Intent(context, Csharp::class.java)
            startActivity(intent)}
        btn_Cpp.setOnClickListener{
            val intent = Intent(context, Cpp::class.java)
            startActivity(intent)}
        btn_java.setOnClickListener{
            val intent = Intent(context, Java::class.java)
            startActivity(intent)}
        return view
    }
}
