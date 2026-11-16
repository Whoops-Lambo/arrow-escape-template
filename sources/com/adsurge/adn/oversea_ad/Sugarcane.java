package com.adsurge.adn.oversea_ad;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Sugarcane implements Runnable {
    public final /* synthetic */ Sultana a;

    public Sugarcane(Sultana sultana) {
        this.a = sultana;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        int iIndexOf;
        Sultana sultana;
        System.currentTimeMillis();
        String string = this.a.toString();
        File fileA = Syrup.a();
        int length = string.length();
        synchronized (Syrup.b) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            FileLock fileLock = null;
            try {
                randomAccessFile = new RandomAccessFile(fileA, "rw");
                try {
                    channel = randomAccessFile.getChannel();
                    try {
                        fileLockLock = channel.lock();
                        try {
                            if (randomAccessFile.length() != 0) {
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
                                while (true) {
                                    int i = channel.read(byteBufferAllocate);
                                    if (i <= 0) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(byteBufferAllocate.array(), 0, i);
                                    byteBufferAllocate.clear();
                                    fileLock = fileLockLock;
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    Octans.a(channel);
                                    Octans.a(randomAccessFile);
                                }
                                string = byteArrayOutputStream + "," + string;
                                while (string.length() > (length + 1) * 50 && (iIndexOf = string.indexOf(",")) >= 0) {
                                    try {
                                        StringTokenizer stringTokenizer = new StringTokenizer(string.substring(0, iIndexOf), ":");
                                        try {
                                            sultana = new Sultana(Long.parseLong(stringTokenizer.nextToken()), stringTokenizer.nextToken());
                                        } catch (Throwable unused2) {
                                            sultana = null;
                                        }
                                        if (sultana != null) {
                                            String strValueOf = String.valueOf(Core.a(sultana.b.getBytes()));
                                            HashMap map = Syrup.a;
                                            synchronized (map) {
                                                map.remove(strValueOf);
                                            }
                                        }
                                        string = string.substring(iIndexOf + 1);
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                            channel.position(0L);
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(string.getBytes());
                            while (byteBufferWrap.hasRemaining()) {
                                channel.write(byteBufferWrap);
                            }
                            channel.truncate(byteBufferWrap.position());
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException unused4) {
                                }
                            }
                            Octans.a(channel);
                        } catch (Throwable unused5) {
                            fileLock = channel;
                            channel = fileLock;
                        }
                    } catch (Throwable unused6) {
                        fileLockLock = null;
                    }
                } catch (Throwable unused7) {
                    fileLockLock = null;
                }
            } catch (Throwable unused8) {
                channel = null;
                randomAccessFile = null;
            }
            Octans.a(randomAccessFile);
        }
    }
}
