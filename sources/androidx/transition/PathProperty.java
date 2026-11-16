package androidx.transition;

import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class PathProperty<T> extends Property<T, Float> {
    public float a;

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(this.a);
    }

    @Override // android.util.Property
    public final void set(Object obj, Float f) {
        this.a = f.floatValue();
        throw null;
    }
}
