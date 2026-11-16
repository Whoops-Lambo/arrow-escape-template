package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ki2 implements ez, dy {
    public static final ki2 a = new ki2();

    @Override // defpackage.ez
    public final ez getCallerFrame() {
        return null;
    }

    @Override // defpackage.dy
    public final sy getContext() {
        return cg0.a;
    }

    @Override // defpackage.dy
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
