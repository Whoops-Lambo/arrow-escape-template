package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class NativeBridgeActivity extends Activity {
    private static final int BG_COLOR = 1090519039;
    private static final String BRIDGED_INTENT = "BRIDGED_INTENT";
    private static final int GPG_RESPONSE_CODE = 4673607;
    private static final String TAG = "NativeBridgeActivity";
    private boolean pendingResult;

    private native void forwardActivityResult(int i, int i2, Intent intent);

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.games");
        super.startActivityForResult(p1, p2);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.games");
        p0.startActivity(p1);
    }

    public static void safedk_NativeBridgeActivity_startActivityForResult_fa3165a91890942c5fc4813c46934a3d(NativeBridgeActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/games/bridge/NativeBridgeActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.games");
        p0.startActivityForResult(p1, p2);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.google.android.gms.games", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        View view = new View(this);
        view.setBackgroundColor(BG_COLOR);
        setContentView(view);
        super.onCreate(bundle);
    }

    static {
        System.loadLibrary("gpg");
    }

    public static void launchBridgeIntent(Activity activity, Intent intent) {
        Log.d(TAG, "Launching bridge activity: parent:" + activity + " intent " + intent);
        Intent intent2 = new Intent(activity, (Class<?>) NativeBridgeActivity.class);
        intent2.putExtra(BRIDGED_INTENT, intent);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.pendingResult) {
            Log.w(TAG, "onDestroy called with pendingResult == true.  forwarding canceled result");
            forwardActivityResult(GPG_RESPONSE_CODE, 0, null);
            this.pendingResult = false;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == GPG_RESPONSE_CODE) {
            Log.d(TAG, "Forwarding activity result to native SDK.");
            forwardActivityResult(i, i2, intent);
            this.pendingResult = false;
        } else {
            Log.d(TAG, "onActivityResult for unknown request code: " + i + " calling finish()");
        }
        finish();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onStart() {
        Intent intent = (Intent) getIntent().getParcelableExtra(BRIDGED_INTENT);
        if (intent != null) {
            safedk_NativeBridgeActivity_startActivityForResult_fa3165a91890942c5fc4813c46934a3d(this, intent, GPG_RESPONSE_CODE);
        }
        super.onStart();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        boolean z;
        if (i == GPG_RESPONSE_CODE) {
            z = true;
        } else {
            z = false;
        }
        this.pendingResult = z;
        if (z) {
            Log.d(TAG, "starting GPG activity: " + intent);
        } else {
            Log.i(TAG, "starting non-GPG activity: " + i + " " + intent);
        }
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, i);
    }
}
