package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface q {
    @Nullable
    IronSourceError a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        private final String a;

        public a(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @Nullable
        public final IronSourceError a(@NotNull h hVar) {
            hVar.getClass();
            h.b bVar = (h.b) hVar;
            if (bVar.f() == null) {
                return new IronSourceError(1060, n30.m(this.a, " was initialized and loaded without Activity"));
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if (com.ironsource.mediationsdk.j.f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = bVar.b();
            if ((strB == null || strB.length() == 0) && bVar.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {

        @NotNull
        private final String a;

        public b(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @Nullable
        public final IronSourceError a(@NotNull h.d dVar) {
            dVar.getClass();
            if (dVar.d() == null) {
                return new IronSourceError(1060, n30.m(this.a, " was initialized and loaded without Activity"));
            }
            if (dVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = dVar.b();
            if ((strB == null || strB.length() == 0) && dVar.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }
}
