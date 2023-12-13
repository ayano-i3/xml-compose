package com.okuda.xml_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.okuda.xml_compose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // View Bindingのインスタンス作成
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // View Bindingの初期化
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            // EditTextからテキストを取得してTextViewにセット
            binding.textView.text = binding.nameEditText.text.toString()
            // EditTextのテキストをクリア
            binding.nameEditText.text.clear()
        }
    }
}