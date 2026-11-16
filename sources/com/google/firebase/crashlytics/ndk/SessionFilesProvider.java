package com.google.firebase.crashlytics.ndk;

import defpackage.b00;
import defpackage.bq1;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class SessionFilesProvider implements bq1 {
    private final SessionFiles sessionFiles;

    @Override // defpackage.bq1
    public File getAppFile() {
        return this.sessionFiles.app;
    }

    @Override // defpackage.bq1
    public b00 getApplicationExitInto() {
        SessionFiles.NativeCore nativeCore = this.sessionFiles.nativeCore;
        if (nativeCore != null) {
            return nativeCore.applicationExitInfo;
        }
        return null;
    }

    public File getBinaryImagesFile() {
        return this.sessionFiles.binaryImages;
    }

    @Override // defpackage.bq1
    public File getDeviceFile() {
        return this.sessionFiles.device;
    }

    @Override // defpackage.bq1
    public File getMetadataFile() {
        return this.sessionFiles.metadata;
    }

    @Override // defpackage.bq1
    public File getMinidumpFile() {
        return this.sessionFiles.nativeCore.minidump;
    }

    @Override // defpackage.bq1
    public File getOsFile() {
        return this.sessionFiles.os;
    }

    @Override // defpackage.bq1
    public File getSessionFile() {
        return this.sessionFiles.session;
    }

    public SessionFilesProvider(SessionFiles sessionFiles) {
        this.sessionFiles = sessionFiles;
    }
}
