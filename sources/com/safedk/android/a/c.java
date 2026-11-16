package com.safedk.android.a;

import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class c extends g {
    FileUploadManager.b a;
    String b;
    String c;

    public c(String str, int i, FileUploadManager.b bVar, String str2) {
        super(null, str, i);
        this.b = null;
        this.c = "GcsUploadFile";
        this.a = bVar;
        this.b = str2;
        Logger.d(this.c, "GcsUploadFile object created for File upload, hash=", str, ", params =", bVar.toString());
    }

    public c(String str, String str2, int i, FileUploadManager.b bVar) {
        super(str, str2, i);
        this.b = null;
        this.c = "GcsUploadFile";
        this.a = bVar;
        Logger.d(this.c, "GcsUploadFile object created, File path=", str, ", hash=", str2, ", params =", bVar.toString());
    }

    @Override // com.safedk.android.a.g
    public g.a a() throws IOException {
        if (this.j == null) {
            Logger.d(this.c, "File to upload is null");
            return null;
        }
        File file = new File(this.j);
        if (!file.exists()) {
            Logger.d(this.c, "File to upload not found ", this.j);
            return null;
        }
        String strD = this.a.d();
        Logger.d(this.c, "About to upload File to ", strD, ", prefix=", this.a.a(), ", File path: ", this.j);
        Bundle bundleC = this.a.c();
        Logger.printFullVerboseLog(this.c, "Uploading File with headers: ", bundleC);
        HashMap map = new HashMap();
        for (String str : bundleC.keySet()) {
            Logger.d(this.c, "adding field key: ", str, " with value: ", bundleC.getString(str));
            map.put(str, bundleC.getString(str));
        }
        d dVar = new d(g.f, strD, "UTF-8", this.i, map);
        dVar.a("file", file, false);
        dVar.a();
        String str2 = this.a.a() + this.a.b();
        Logger.d(this.c, "File uploaded successfully to GCS");
        return new g.a(str2, dVar.b(), this.k);
    }

    public g.a b() throws Throwable {
        String strD = this.a.d();
        Logger.d(this.c, "About to upload File to ", strD, ", prefix=", this.a.a());
        Bundle bundleC = this.a.c();
        Logger.printFullVerboseLog(this.c, "Uploading File with headers: ", bundleC);
        HashMap map = new HashMap();
        for (String str : bundleC.keySet()) {
            Logger.d(this.c, "adding field key: ", str, " with value: ", bundleC.getString(str));
            map.put(str, bundleC.getString(str));
        }
        d dVar = new d(g.f, strD, "UTF-8", this.i, map);
        a(dVar);
        dVar.a();
        Logger.d(this.c, "File uploaded successfully to GCS");
        return new g.a(strD, dVar.b(), this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.safedk.android.a.d] */
    public void a(d dVar) throws Throwable {
        ?? CreateTempFile;
        FileOutputStream fileOutputStream;
        ?? r3 = 0;
        ?? r4 = 0;
        try {
            try {
                CreateTempFile = File.createTempFile("file", ".gz");
                try {
                    Logger.d(this.c, "created temp file in: ", CreateTempFile.getAbsolutePath());
                    fileOutputStream = new FileOutputStream((File) CreateTempFile);
                    fileOutputStream.write(this.b.getBytes("UTF-8"));
                    dVar.a(CreateTempFile);
                    r3 = fileOutputStream;
                    if (CreateTempFile != 0 && CreateTempFile.exists()) {
                        r3 = fileOutputStream;
                        CreateTempFile.delete();
                        r3 = fileOutputStream;
                    }
                } catch (IOException e) {
                    e = e;
                    r4 = CreateTempFile;
                    Logger.d(this.c, "Error adding gzip file: ", e);
                    r3 = r4;
                    if (r4 != 0 && r4.exists()) {
                        r3 = r4;
                        r4.delete();
                        r3 = r4;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (CreateTempFile != 0 && CreateTempFile.exists()) {
                        CreateTempFile.delete();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            r3 = r4;
            r3 = fileOutputStream;
        } catch (Throwable th2) {
            th = th2;
            CreateTempFile = r3;
        }
    }
}
