package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.HandlerWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bm1 implements Handler.Callback {
    public final am1 a = new am1(this);
    public MediaSource b;
    public MediaPeriod c;
    public final /* synthetic */ cm1 d;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        cm1 cm1Var = this.d;
        HandlerWrapper handlerWrapper = cm1Var.c;
        int i = message.what;
        am1 am1Var = this.a;
        if (i == 0) {
            MediaSource mediaSourceCreateMediaSource = cm1Var.a.createMediaSource((MediaItem) message.obj);
            this.b = mediaSourceCreateMediaSource;
            mediaSourceCreateMediaSource.prepareSource(am1Var, null, PlayerId.UNSET);
            handlerWrapper.sendEmptyMessage(1);
            return true;
        }
        if (i == 1) {
            try {
                MediaPeriod mediaPeriod = this.c;
                if (mediaPeriod == null) {
                    ((MediaSource) Assertions.checkNotNull(this.b)).maybeThrowSourceInfoRefreshError();
                } else {
                    mediaPeriod.maybeThrowPrepareError();
                }
                handlerWrapper.sendEmptyMessageDelayed(1, 100);
                return true;
            } catch (Exception e) {
                cm1Var.d.n(e);
                handlerWrapper.obtainMessage(3).sendToTarget();
                return true;
            }
        }
        if (i == 2) {
            ((MediaPeriod) Assertions.checkNotNull(this.c)).continueLoading(0L);
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (this.c != null) {
            ((MediaSource) Assertions.checkNotNull(this.b)).releasePeriod(this.c);
        }
        ((MediaSource) Assertions.checkNotNull(this.b)).releaseSource(am1Var);
        handlerWrapper.removeCallbacksAndMessages(null);
        cm1Var.b.quit();
        return true;
    }

    public bm1(cm1 cm1Var) {
        this.d = cm1Var;
    }
}
