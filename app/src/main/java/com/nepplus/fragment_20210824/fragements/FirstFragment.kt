package com.nepplus.fragment_20210824.fragements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nepplus.fragment_20210824.R

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



}