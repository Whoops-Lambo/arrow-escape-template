package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.d;
import defpackage.dr0;
import defpackage.e6;
import defpackage.nj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {
    public final Compat a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class Api31Impl {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public final BuilderCompat a;

        public final ContentInfoCompat a() {
            return this.a.build();
        }

        public final void b(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        public final void c(int i) {
            this.a.b(i);
        }

        public final void d(Uri uri) {
            this.a.a(uri);
        }

        public Builder(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new BuilderCompat31Impl(clipData, i);
                return;
            }
            BuilderCompatImpl builderCompatImpl = new BuilderCompatImpl();
            builderCompatImpl.a = clipData;
            builderCompatImpl.b = i;
            this.a = builderCompatImpl;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface BuilderCompat {
        void a(Uri uri);

        void b(int i);

        ContentInfoCompat build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class BuilderCompat31Impl implements BuilderCompat {
        public final ContentInfo.Builder a;

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void b(int i) {
            this.a.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.a.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        public BuilderCompat31Impl(ClipData clipData, int i) {
            this.a = e6.j(clipData, i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class BuilderCompatImpl implements BuilderCompat {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void b(int i) {
            this.c = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Compat {
        ContentInfo a();

        ClipData b();

        int c();

        int getSource();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static final class Compat31Impl implements Compat {
        public final ContentInfo a;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ContentInfo a() {
            return this.a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ClipData b() {
            return this.a.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int c() {
            return this.a.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int getSource() {
            return this.a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }

        public Compat31Impl(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.a = e6.B(contentInfo);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class CompatImpl implements Compat {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ClipData b() {
            return this.a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int c() {
            return this.c;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int getSource() {
            return this.b;
        }

        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            int i = this.b;
            if (i == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i != 4) {
                strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb.append(strValueOf);
            sb.append(", flags=");
            int i2 = this.c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return nj.q(sb, this.e != null ? ", hasExtras" : "", "}");
        }

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            ClipData clipData = builderCompatImpl.a;
            clipData.getClass();
            this.a = clipData;
            int i = builderCompatImpl.b;
            if (i >= 0) {
                if (i <= 5) {
                    this.b = i;
                    int i2 = builderCompatImpl.c;
                    if ((i2 & 1) == i2) {
                        this.c = i2;
                        this.d = builderCompatImpl.d;
                        this.e = builderCompatImpl.e;
                        return;
                    }
                    dr0.j("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
                    throw null;
                }
                Locale locale = Locale.US;
                d.r("source is out of range of [0, 5] (too high)");
                throw null;
            }
            Locale locale2 = Locale.US;
            d.r("source is out of range of [0, 5] (too low)");
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Flags {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    public final ClipData a() {
        return this.a.b();
    }

    public final int b() {
        return this.a.c();
    }

    public final int c() {
        return this.a.getSource();
    }

    public final String toString() {
        return this.a.toString();
    }

    public ContentInfoCompat(Compat compat) {
        this.a = compat;
    }
}
