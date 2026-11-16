package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DownloadAction {
    public final byte[] data;
    public final boolean isRemoveAction;
    public final String type;
    public final Uri uri;
    public final int version;

    public abstract Downloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper);

    public boolean equals(@Nullable Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            DownloadAction downloadAction = (DownloadAction) obj;
            if (this.type.equals(downloadAction.type) && this.version == downloadAction.version && this.uri.equals(downloadAction.uri) && this.isRemoveAction == downloadAction.isRemoveAction && Arrays.equals(this.data, downloadAction.data)) {
                return true;
            }
        }
        return false;
    }

    public abstract void writeToStream(DataOutputStream dataOutputStream) throws IOException;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Deserializer {
        public final String type;
        public final int version;

        public abstract DownloadAction readFromStream(int i, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i) {
            this.type = str;
            this.version = i;
        }
    }

    public static DownloadAction deserializeFromStream(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String utf = dataInputStream.readUTF();
        int i = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (utf.equals(deserializer.type) && deserializer.version >= i) {
                return deserializer.readFromStream(i, dataInputStream);
            }
        }
        throw new DownloadException("No deserializer found for:" + utf + ", " + i);
    }

    public static void serializeToStream(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.type);
        dataOutputStream.writeInt(downloadAction.version);
        downloadAction.writeToStream(dataOutputStream);
        dataOutputStream.flush();
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + (((this.uri.hashCode() * 31) + (this.isRemoveAction ? 1 : 0)) * 31);
    }

    public boolean isSameMedia(DownloadAction downloadAction) {
        return this.uri.equals(downloadAction.uri);
    }

    public final byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            serializeToStream(this, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            y.b();
            return null;
        }
    }

    public DownloadAction(String str, int i, Uri uri, boolean z, @Nullable byte[] bArr) {
        this.type = str;
        this.version = i;
        this.uri = uri;
        this.isRemoveAction = z;
        this.data = bArr == null ? new byte[0] : bArr;
    }
}
