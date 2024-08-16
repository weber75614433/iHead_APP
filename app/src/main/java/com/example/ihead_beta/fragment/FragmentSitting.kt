package com.example.ihead_beta.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.ihead_beta.activity.MainActivitySittingCorrection

class FragmentSitting : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("坐姿異常!!!").setMessage("請將背挺直，並重新調整坐姿")
            .setPositiveButton("確定") {dialog, id ->
                val intent = Intent(requireActivity(), MainActivitySittingCorrection::class.java)
                startActivity(intent)
            }
                .setNegativeButton("取消") {dialog, id ->
                    dialog.dismiss()
                }

        return builder.create()
    }
}


