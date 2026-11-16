package com.google.games.bridge;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class SimpleUiRequest implements HelperFragment.Request {
    private static final String TAG = "SimpleUiRequest";
    private final TaskCompletionSource<Integer> resultTaskSource = new TaskCompletionSource<>();

    public Task<Intent> getIntent(Activity activity) {
        return null;
    }

    public Task<Integer> getTask() {
        return this.resultTaskSource.getTask();
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9003) {
            if (i2 == -1 || i2 == 0) {
                setResult(1);
                return;
            }
            if (i2 == 10001) {
                setResult(-3);
                return;
            }
            Log.d(TAG, "onActivityResult unknown resultCode: " + i2);
            setResult(-2);
        }
    }

    public void setFailure(Exception exc) {
        this.resultTaskSource.setException(exc);
        HelperFragment.finishRequest(this);
    }

    public void setResult(int i) {
        this.resultTaskSource.setResult(Integer.valueOf(i));
        HelperFragment.finishRequest(this);
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void process(final HelperFragment helperFragment) {
        Activity activity = helperFragment.getActivity();
        getIntent(activity).addOnSuccessListener(activity, new OnSuccessListener<Intent>() { // from class: com.google.games.bridge.SimpleUiRequest.2
            public static void safedk_Utils_startActivityForResult_334aac1788e3e1244aa253a3f1e86182(Fragment p0, Intent p1, int p2) {
                Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/games/bridge/Utils;->startActivityForResult(Landroid/app/Fragment;Landroid/content/Intent;I)V");
                if (p1 == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.games");
                Utils.startActivityForResult(p0, p1, p2);
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Intent intent) {
                safedk_Utils_startActivityForResult_334aac1788e3e1244aa253a3f1e86182(helperFragment, intent, 9003);
            }
        }).addOnFailureListener(activity, new OnFailureListener() { // from class: com.google.games.bridge.SimpleUiRequest.1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                SimpleUiRequest.this.setFailure(exc);
            }
        });
    }
}
