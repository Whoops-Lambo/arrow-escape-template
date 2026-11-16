package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import defpackage.s71;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends g {
    public final File a;
    public final f b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s71.b(this.a, eVar.a) && s71.b(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InProgress(file=" + this.a + ", progress=" + this.b + ')';
    }

    public e(File file, f fVar) {
        file.getClass();
        fVar.getClass();
        this.a = file;
        this.b = fVar;
    }
}
