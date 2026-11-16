package com.google.games.bridge;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class GenericResolutionActivity extends Activity {
    static final int SELECT_UI_STATUS_INTERNAL_ERROR = 0;
    static final int SELECT_UI_STATUS_RESULT_OK = -1;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.google.android.gms.games", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        GenericResolutionActivity genericResolutionActivity;
        super.onCreate(bundle);
        try {
            genericResolutionActivity = this;
            try {
                genericResolutionActivity.startIntentSenderForResult(((PendingIntent) getIntent().getParcelableExtra("RequestFriendsAccessPermissionPendingIntent")).getIntentSender(), 9011, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException unused) {
                genericResolutionActivity.finishWithResult(0);
            }
        } catch (IntentSender.SendIntentException unused2) {
            genericResolutionActivity = this;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 9011) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            finishWithResult(-1);
        } else {
            finishWithResult(0);
        }
    }

    private void finishWithResult(int i) {
        setResult(i);
        finish();
    }
}
