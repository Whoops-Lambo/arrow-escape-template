package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {
    public static final b a = new d();
    public static final b b;
    protected a c;
    protected File d;
    protected List<String> e;

    public abstract void a();

    static {
        new f();
        b = new e();
    }

    public void a(a aVar, File file, List<String> list) {
        this.c = aVar;
        this.d = file;
        this.e = list;
    }
}
