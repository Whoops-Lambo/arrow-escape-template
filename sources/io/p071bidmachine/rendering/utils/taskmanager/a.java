package io.p071bidmachine.rendering.utils.taskmanager;

import io.p071bidmachine.util.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements Runnable, c {
    public final /* synthetic */ int a;
    public final AtomicBoolean b;

    public abstract void c();

    public a(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicBoolean(false);
                break;
            default:
                this.b = new AtomicBoolean(false);
                break;
        }
    }

    public void a(boolean z) {
        switch (this.a) {
            case 0:
                this.b.set(z);
                break;
            default:
                this.b.set(z);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (!this.b.get()) {
                    c();
                    break;
                }
                break;
            default:
                if (!this.b.get()) {
                    c();
                    break;
                }
                break;
        }
    }
}
