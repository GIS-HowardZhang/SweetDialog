package com.giszone.sweetdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        new SweetDialog(this, SweetDialog.WARNING_TYPE)
//                .setTitleText("确定删除")
//                .setContentText("该操作不可恢复！")
//                .setCancelButton("取消", Dialog::dismiss)
//                .setConfirmButton("确定", sDialog ->
//                        sDialog.setTitleText("已删除")
//                                .setContentText("该文件已删除")
//                                .setConfirmButton("确定", null)
//                                .showCancelButton(false)
//                                .changeAlertType(SweetDialog.SUCCESS_TYPE))
//                .show();

        new SweetDialog(this, SweetDialog.CUSTOM_IMAGE_TYPE)
                .setBackCancelable(true)
                .setOutsideCancelable(true)
                .setCustomImage(R.drawable.ic_logo_giszone_name)
                .setTitleText("权限申请")
                .setContentText("本软件需要您的存储、网络等权限，不涉及您的隐私，请您逐一点按\"始终允许\"！")
                .setConfirmButton("确定", SweetDialog::dismissWithAnimation)
                .show();
    }
}
