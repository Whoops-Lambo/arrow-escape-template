package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class MotionButton extends AppCompatButton {
    public float d;
    public float e;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionButton$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionButton$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    public float getRound() {
        return this.e;
    }

    public float getRoundPercent() {
        return this.d;
    }

    @RequiresApi
    public void setRoundPercent(float f) {
        boolean z = this.d != f;
        this.d = f;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.e = f;
            float f2 = this.d;
            this.d = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.e != f) {
            z = true;
        } else {
            z = false;
        }
        this.e = f;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setClipToOutline(false);
            if (z) {
                invalidateOutline();
                return;
            }
            return;
        }
        setClipToOutline(true);
        getWidth();
        getHeight();
        throw null;
    }
}
