package com.google.android.gms.games.internal.v2.resolution;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.games_v2.zzfn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class GamesResolutionActivity extends Activity {

    @Nullable
    private ResultReceiver zza;
    private boolean zzb;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.google.android.gms.games", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        GamesResolutionActivity gamesResolutionActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.zza = (ResultReceiver) Preconditions.checkNotNull((ResultReceiver) bundle.getParcelable("resultReceiver"));
            return;
        }
        this.zza = (ResultReceiver) Preconditions.checkNotNull((ResultReceiver) getIntent().getParcelableExtra("resultReceiver"));
        try {
            gamesResolutionActivity = this;
            try {
                gamesResolutionActivity.startIntentSenderForResult(((PendingIntent) Preconditions.checkNotNull((PendingIntent) getIntent().getParcelableExtra(BaseGmsClient.KEY_PENDING_INTENT))).getIntentSender(), 0, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                zzfn.a.e(zzfn.c("ResultActivity"), "Failed to launch", e);
                gamesResolutionActivity.zza(0, null);
                gamesResolutionActivity.finish();
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            gamesResolutionActivity = this;
        }
    }

    private final void zza(int i, @Nullable Intent intent) {
        Bundle bundle;
        if (this.zzb) {
            return;
        }
        this.zzb = true;
        ResultReceiver resultReceiver = this.zza;
        if (resultReceiver != null) {
            if (intent == null) {
                bundle = new Bundle();
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("resultData", intent);
                bundle = bundle2;
            }
            resultReceiver.send(i, bundle);
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, @NonNull Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            zzfn.a.e(zzfn.c("ResultActivity"), pv1.l(i, "Unexpected request code: ", new StringBuilder(String.valueOf(i).length() + 25)));
            zza(0, intent);
            finish();
            return;
        }
        zza(i2, intent);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (!isChangingConfigurations()) {
            zza(0, null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("resultReceiver", this.zza);
    }
}
