package com.applovin.shadow.okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/applovin/shadow/okio/-DeprecatedOkio;", "", "()V", "appendingSink", "Lcom/applovin/shadow/okio/Sink;", "file", "Ljava/io/File;", "blackhole", "buffer", "Lcom/applovin/shadow/okio/BufferedSink;", "sink", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "Lcom/applovin/shadow/okio/Source;", "outputStream", "Ljava/io/OutputStream;", "socket", "Ljava/net/Socket;", "path", "Ljava/nio/file/Path;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeprecatedOkio {

    @NotNull
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    @NotNull
    public final Sink appendingSink(@NotNull File file) {
        file.getClass();
        return Okio.appendingSink(file);
    }

    @NotNull
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @NotNull
    public final BufferedSink buffer(@NotNull Sink sink) {
        sink.getClass();
        return Okio.buffer(sink);
    }

    @NotNull
    public final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) {
        path.getClass();
        openOptionArr.getClass();
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @NotNull
    public final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) {
        path.getClass();
        openOptionArr.getClass();
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @NotNull
    public final BufferedSource buffer(@NotNull Source source) {
        source.getClass();
        return Okio.buffer(source);
    }

    @NotNull
    public final Sink sink(@NotNull OutputStream outputStream) {
        outputStream.getClass();
        return Okio.sink(outputStream);
    }

    @NotNull
    public final Source source(@NotNull InputStream inputStream) {
        inputStream.getClass();
        return Okio.source(inputStream);
    }

    @NotNull
    public final Sink sink(@NotNull File file) {
        file.getClass();
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @NotNull
    public final Source source(@NotNull File file) {
        file.getClass();
        return Okio.source(file);
    }

    @NotNull
    public final Sink sink(@NotNull Socket socket) {
        socket.getClass();
        return Okio.sink(socket);
    }

    @NotNull
    public final Source source(@NotNull Socket socket) {
        socket.getClass();
        return Okio.source(socket);
    }
}
