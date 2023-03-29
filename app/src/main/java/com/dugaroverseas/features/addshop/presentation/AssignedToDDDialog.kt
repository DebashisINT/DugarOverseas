package com.dugaroverseas.features.addshop.presentation

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dugaroverseas.R
import com.dugaroverseas.app.Pref
import com.dugaroverseas.app.domain.AssignToDDEntity
import com.dugaroverseas.widgets.AppCustomEditText
import com.dugaroverseas.widgets.AppCustomTextView

/**
 * Created by Saikat on 18-Sep-18.
 */
class AssignedToDDDialog : DialogFragment() {

    private lateinit var rv_common_dialog_list: RecyclerView
    private lateinit var mContext: Context
    private lateinit var dialog_header_TV: AppCustomTextView
    private lateinit var et_search: AppCustomEditText
    private var adapter: AssignedToDDAdapter? = null

    companion object {

        private var listener: OnItemSelectedListener? = null
        private var mAssignedList: ArrayList<AssignToDDEntity>? = null

        fun newInstance(assignedList: List<AssignToDDEntity>?, param: OnItemSelectedListener): AssignedToDDDialog {
            val dialogFragment = AssignedToDDDialog()
            /*val bundle = Bundle()
            bundle.putStringArrayList("list", mAssignedList)
            dialogFragment.arguments = bundle*/
            mAssignedList = assignedList as ArrayList<AssignToDDEntity>
            listener = param
            return dialogFragment
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mAssignedList = arguments?.getStringArrayList("list")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        dialog?.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog?.setCanceledOnTouchOutside(true)

        val v = inflater.inflate(R.layout.dialog_list, container, false)

        //isCancelable = true

        initView(v)
        initTextChangeListener()
        return v
    }

    private fun initView(v: View) {
        dialog_header_TV = v.findViewById(R.id.dialog_header_TV)
        rv_common_dialog_list = v.findViewById(R.id.rv_common_dialog_list)
        rv_common_dialog_list.layoutManager = LinearLayoutManager(mContext)
        dialog_header_TV.text = "Assigned to " + Pref.ddText + " List"
        et_search = v.findViewById(R.id.et_search)

        initAdapter()
    }

    private fun initAdapter() {
        adapter = AssignedToDDAdapter(mContext, mAssignedList, object : AssignedToDDAdapter.OnItemClickListener {
            override fun onItemClick(dd: AssignToDDEntity?) {
                listener?.onItemSelect(dd)
                dismiss()
            }
        })
        rv_common_dialog_list.adapter = adapter
    }


    private fun initTextChangeListener() {
        et_search.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (!TextUtils.isEmpty(et_search.text.toString().trim()))
                    adapter?.filter?.filter(et_search.text.toString().trim())
                else
                    initAdapter()
            }
        })
    }

    interface OnItemSelectedListener {
        fun onItemSelect(dd: AssignToDDEntity?)
    }
}