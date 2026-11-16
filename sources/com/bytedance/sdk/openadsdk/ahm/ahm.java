package com.bytedance.sdk.openadsdk.ahm;

import com.bytedance.sdk.component.utils.yo;
import com.bytedance.sdk.openadsdk.utils.mw;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ahm {
    protected boolean kgy = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy implements Runnable {
        private final File ahm;

        private kgy(File file) {
            this.ahm = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ahm.this.ahm(this.ahm);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyNY7y6dBg==", "d/w4sQqvYuGJRtIZuB61K1PcOJsNvWvLhQ==", "Sfsj", 90);
            }
        }
    }

    public abstract void kgy(List<File> list);

    public abstract boolean kgy(long j, int i);

    public abstract boolean kgy(File file, long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(File file) throws IOException {
        if (this.kgy) {
            List<File> listKgy = yo.kgy(file);
            listKgy.toString();
            kgy(listKgy);
        } else {
            try {
                yo.ahm(file);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4gYsyNY7y6dBg==", "d/w4sQqvYuGJRtI=", "T+E4lguVZ+WBSdxanh61Jl8=", 56);
            }
            kgy(yo.kgy(file.getParentFile()));
        }
    }

    public void kgy(File file) throws IOException {
        mw.rz(new kgy(file));
    }

    public long ahm(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
