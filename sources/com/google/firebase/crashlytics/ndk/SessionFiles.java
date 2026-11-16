package com.google.firebase.crashlytics.ndk;

import androidx.annotation.Nullable;
import defpackage.b00;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class SessionFiles {
    public final File app;
    public final File binaryImages;
    public final File device;
    public final File metadata;
    public final NativeCore nativeCore;
    public final File os;
    public final File session;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        private File app;
        private File binaryImages;
        private File device;
        private File metadata;
        private NativeCore nativeCore;
        private File os;
        private File session;

        public Builder appFile(File file) {
            this.app = file;
            return this;
        }

        public Builder binaryImagesFile(File file) {
            this.binaryImages = file;
            return this;
        }

        public SessionFiles build() {
            return new SessionFiles(this);
        }

        public Builder deviceFile(File file) {
            this.device = file;
            return this;
        }

        public Builder metadataFile(File file) {
            this.metadata = file;
            return this;
        }

        public Builder nativeCore(NativeCore nativeCore) {
            this.nativeCore = nativeCore;
            return this;
        }

        public Builder osFile(File file) {
            this.os = file;
            return this;
        }

        public Builder sessionFile(File file) {
            this.session = file;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class NativeCore {

        @Nullable
        public final b00 applicationExitInfo;

        @Nullable
        public final File minidump;

        public boolean hasCore() {
            File file = this.minidump;
            return (file != null && file.exists()) || this.applicationExitInfo != null;
        }

        public NativeCore(@Nullable File file, @Nullable b00 b00Var) {
            this.minidump = file;
            this.applicationExitInfo = b00Var;
        }
    }

    private SessionFiles(Builder builder) {
        this.nativeCore = builder.nativeCore;
        this.binaryImages = builder.binaryImages;
        this.metadata = builder.metadata;
        this.session = builder.session;
        this.app = builder.app;
        this.device = builder.device;
        this.os = builder.os;
    }
}
