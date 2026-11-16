package com.google.games.bridge;

import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
class GenericResolutionUiRequest implements HelperFragment.Request {
    static final int SELECT_UI_STATUS_INTERNAL_ERROR = -2;
    static final int SELECT_UI_STATUS_RESULT_OK = 1;
    static final int SELECT_UI_STATUS_USER_CLOSED_UI = -6;
    private static final String TAG = "FriendsSharingConsent";
    private final PendingIntent pendingIntent;
    private final TaskCompletionSource<Integer> resultTaskSource = new TaskCompletionSource<>();

    public static void safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.games");
        p0.startActivityForResult(p1, p2);
    }

    public Task<Integer> getTask() {
        return this.resultTaskSource.getTask();
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9011) {
            if (i2 == -1) {
                setResult(1);
                return;
            }
            if (i2 == 0) {
                setResult(-6);
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

    public void setResult(Integer num) {
        this.resultTaskSource.setResult(num);
        HelperFragment.finishRequest(this);
    }

    public GenericResolutionUiRequest(PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void process(HelperFragment helperFragment) {
        Intent intent = new Intent(helperFragment.getActivity(), (Class<?>) GenericResolutionActivity.class);
        intent.putExtra("RequestFriendsAccessPermissionPendingIntent", this.pendingIntent);
        safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(helperFragment, intent, 9011);
    }
}
