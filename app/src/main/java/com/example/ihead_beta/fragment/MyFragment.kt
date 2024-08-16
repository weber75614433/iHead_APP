package com.example.ihead_beta.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

class MyFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("坐姿異常!!!").setMessage("請將背挺直，重新調整坐姿")
            .setPositiveButton("OK") { dialog, id -> }.setNegativeButton("Cancel")
        return builder.create()
    }


    private fun AlertDialog.Builder.setNegativeButton(s: String) {

    }

    private fun AlertDialog.Builder.setPositiveButton(s: String) {

    }
}
