package com.example.hw2_sopt

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

fun EditText.textChangedListner(textChanged:(CharSequence?)->Unit){
    this.addTextChangedListener(object : TextWatcher
    {
        override fun afterTextChanged(s: Editable?) = Unit

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        //s에 대한 정보를 넘겨줘야한다
        textChanged(s)
    }

    })
}