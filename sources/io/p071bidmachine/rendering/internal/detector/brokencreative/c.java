package io.p071bidmachine.rendering.internal.detector.brokencreative;

import android.os.Handler;
import defpackage.jc1;
import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.util.taskmanager.handler.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends rc1 implements sr0 {
    public static final c i = new c(0);

    @Override // defpackage.sr0
    public final Object invoke() {
        return new b(new Handler(jc1.h("BrokenCreativeDetectorTaskManager").getLooper()));
    }
}
