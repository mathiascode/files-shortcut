package com.android.files;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class FilesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName("com.android.documentsui", "com.android.documentsui.files.FilesActivity");
        intent.setData(Uri.parse("content://com.android.externalstorage.documents/root/primary"));
        startActivity(intent);
        finish();
    }
}
