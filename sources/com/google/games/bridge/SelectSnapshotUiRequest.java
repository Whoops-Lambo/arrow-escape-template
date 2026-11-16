package com.google.games.bridge;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class SelectSnapshotUiRequest implements HelperFragment.Request {
    static final int SELECT_UI_STATUS_AUTHENTICATION_ERROR = -3;
    static final int SELECT_UI_STATUS_GAME_SELECTED = 1;
    static final int SELECT_UI_STATUS_INTERNAL_ERROR = -1;
    static final int SELECT_UI_STATUS_UI_BUSY = -5;
    static final int SELECT_UI_STATUS_USER_CLOSED_UI = 2;
    private static final String TAG = "SelectSnapshotUiRequest";
    private boolean allowAddButton;
    private boolean allowDelete;
    private int maxSnapshots;
    private final TaskCompletionSource<Result> resultTaskSource = new TaskCompletionSource<>();
    private String title;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class Result {
        public SnapshotMetadata metadata;
        public int status;

        public Result(int i, SnapshotMetadata snapshotMetadata) {
            this.status = i;
            this.metadata = snapshotMetadata;
        }
    }

    public Task<Result> getTask() {
        return this.resultTaskSource.getTask();
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9004) {
            if (i2 == -1) {
                setResult(1, (SnapshotMetadata) intent.getParcelableExtra(SnapshotsClient.EXTRA_SNAPSHOT_METADATA));
                return;
            }
            if (i2 == 0) {
                setResult(2);
                return;
            }
            if (i2 == 10001) {
                setResult(-3);
                return;
            }
            Log.d(TAG, "onActivityResult unknown resultCode: " + i2);
            setResult(-1);
        }
    }

    public void setFailure(Exception exc) {
        this.resultTaskSource.setException(exc);
        HelperFragment.finishRequest(this);
    }

    public void setResult(int i, SnapshotMetadata snapshotMetadata) {
        this.resultTaskSource.setResult(new Result(i, snapshotMetadata));
        HelperFragment.finishRequest(this);
    }

    public SelectSnapshotUiRequest(String str, boolean z, boolean z2, int i) {
        this.title = str;
        this.allowAddButton = z;
        this.allowDelete = z2;
        this.maxSnapshots = i;
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void process(final HelperFragment helperFragment) {
        Activity activity = helperFragment.getActivity();
        PlayGames.getSnapshotsClient(activity).getSelectSnapshotIntent(this.title, this.allowAddButton, this.allowDelete, this.maxSnapshots).addOnSuccessListener(activity, new OnSuccessListener<Intent>() { // from class: com.google.games.bridge.SelectSnapshotUiRequest.2
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
                safedk_Utils_startActivityForResult_334aac1788e3e1244aa253a3f1e86182(helperFragment, intent, 9004);
            }
        }).addOnFailureListener(activity, new OnFailureListener() { // from class: com.google.games.bridge.SelectSnapshotUiRequest.1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                SelectSnapshotUiRequest.this.setFailure(exc);
            }
        });
    }

    public void setResult(int i) {
        setResult(i, null);
    }
}
