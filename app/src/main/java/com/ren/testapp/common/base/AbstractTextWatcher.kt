package com.ren.testapp.common.base

import android.text.Editable
import android.text.TextWatcher

open class AbstractTextWatcher : TextWatcher {
    override fun afterTextChanged(s: Editable?) {
        // empty
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        // empty
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        // empty
    }
}