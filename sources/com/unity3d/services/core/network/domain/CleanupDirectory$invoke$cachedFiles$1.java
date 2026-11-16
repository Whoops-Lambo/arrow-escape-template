package com.unity3d.services.core.network.domain;

import defpackage.ks0;
import defpackage.wr0;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends ks0 implements wr0 {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, "isFile", "isFile()Z", 0);
    }

    @Override // defpackage.wr0
    public final Boolean invoke(File file) {
        file.getClass();
        return Boolean.valueOf(file.isFile());
    }
}
