package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/util/ImpulseCalculator;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ImpulseCalculator {
    public float a;
    public long b = Long.MAX_VALUE;
    public float c = Float.NaN;
    public boolean d = true;

    public final void a(long j, float f) {
        if (this.b == Long.MAX_VALUE || Float.isNaN(this.c)) {
            this.b = j;
            this.c = f;
            return;
        }
        if (j == this.b) {
            this.c = f;
            return;
        }
        float fA = VelocityTrackerKt.a(this.a);
        float f2 = (f - this.c) / ((j - this.b) * 0.001f);
        float fAbs = (Math.abs(f2) * (f2 - fA)) + this.a;
        this.a = fAbs;
        if (this.d) {
            this.a = fAbs * 0.5f;
            this.d = false;
        }
        this.b = j;
        this.c = f;
    }
}
