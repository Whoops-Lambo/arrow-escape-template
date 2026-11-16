package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class mi3 {
    public final Runnable b;
    public hi3 a = null;
    public boolean c = true;

    public void unregisterOnBackPressedCallback() {
        this.a = null;
    }

    public void registerOnBackPressedCallback() {
        if (this.a != null) {
            return;
        }
        this.a = new hi3(this.b);
    }

    public mi3(Runnable runnable) {
        this.b = runnable;
    }
}
