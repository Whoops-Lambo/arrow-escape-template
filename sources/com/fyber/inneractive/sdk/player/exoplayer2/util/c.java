package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public final File a;
    public final File b;

    public final FileInputStream a() {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
        return new FileInputStream(this.a);
    }

    public final b b() throws IOException {
        if (this.a.exists()) {
            boolean zExists = this.b.exists();
            File file = this.a;
            if (zExists) {
                file.delete();
            } else if (!file.renameTo(this.b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.a + " to backup file " + this.b);
            }
        }
        try {
            return new b(this.a);
        } catch (FileNotFoundException unused) {
            if (!this.a.getParentFile().mkdirs()) {
                io.p071bidmachine.media3.extractor.ts.y.i(this.a, "Couldn't create directory ");
                return null;
            }
            try {
                return new b(this.a);
            } catch (FileNotFoundException unused2) {
                io.p071bidmachine.media3.extractor.ts.y.i(this.a, "Couldn't create ");
                return null;
            }
        }
    }

    public c(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }
}
