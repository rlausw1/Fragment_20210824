package com.nepplus.fragment_20210824.fragements

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.fragment_20210824.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    //xml + kt 의 조합 => 연결을 어떻게?
    //kt단에서 어떤 xml을 쓸지 연결 (전용 함수 존재)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)

    }

//동작 관련 코드들이 작성되는 함수 =>액티비티 : onCreate
//이 클래스 : 화면 X , 화면에 올라가는 부품 ()
//프래그먼트의 mCreate는 화면도 준비되기 전 => 동작시키면 에러 소지가 높다

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    loginBtn.setOnClickListener {
        Log.d("부품에서 찍기", "로그버튼 눌림")
    }





        }


    }



}