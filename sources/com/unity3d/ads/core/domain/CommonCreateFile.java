package com.unity3d.ads.core.domain;

import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCreateFile;", "Lcom/unity3d/ads/core/domain/CreateFile;", "<init>", "()V", "invoke", "Ljava/io/File;", "parent", "child", "", "pathname", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    @NotNull
    public File invoke(@NotNull File parent, @NotNull String child) {
        parent.getClass();
        child.getClass();
        return new File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    @NotNull
    public File invoke(@NotNull String pathname) {
        pathname.getClass();
        return new File(pathname);
    }
}
