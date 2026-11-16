package io.p071bidmachine.rendering.internal;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.p071bidmachine.util.n;
import io.p071bidmachine.util.taskmanager.handler.a;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/rendering/internal/AdActivity;", "Landroid/app/Activity;", "<init>", "()V", "bidmachine-android-sdk_bb_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class AdActivity extends Activity {
    public static final /* synthetic */ int a = 0;

    public void a() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "io.bidmachine", me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.bidmachine.rendering.internal.b] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        a aVar = n.a;
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                overrideActivityTransition(0, 0, 0, 0);
                overrideActivityTransition(1, 0, 0, 0);
            } catch (Throwable unused) {
                try {
                    overridePendingTransition(0, 0);
                } catch (Throwable unused2) {
                }
            }
        } else {
            overridePendingTransition(0, 0);
        }
        super.onCreate(bundle);
        setVolumeControlStream(3);
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: io.bidmachine.rendering.internal.b
                public final void onBackInvoked() {
                    int i = AdActivity.a;
                    this.a.a();
                }
            });
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a();
    }
}
