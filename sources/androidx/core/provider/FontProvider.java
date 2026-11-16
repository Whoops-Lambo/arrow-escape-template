package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
class FontProvider {
    public static final LruCache a = new LruCache(2);
    public static final a b = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ContentQueryWrapper {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ProviderCacheKey {
        public String a;
        public String b;
        public List c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderCacheKey)) {
                return false;
            }
            ProviderCacheKey providerCacheKey = (ProviderCacheKey) obj;
            return Objects.equals(this.a, providerCacheKey.a) && Objects.equals(this.b, providerCacheKey.b) && Objects.equals(this.c, providerCacheKey.c);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {
        public final ContentProviderClient a;

        public ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    public static FontsContractCompat.FontFamilyResult a(Context context, List list) {
        Trace.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                FontRequest fontRequest = (FontRequest) list.get(i);
                ProviderInfo providerInfoB = b(context.getPackageManager(), fontRequest, context.getResources());
                if (providerInfoB == null) {
                    return new FontsContractCompat.FontFamilyResult();
                }
                arrayList.add(c(context, fontRequest, providerInfoB.authority));
            }
            return new FontsContractCompat.FontFamilyResult(arrayList);
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, FontRequest fontRequest, Resources resources) {
        a aVar = b;
        LruCache lruCache = a;
        Trace.a("FontProvider.getProvider");
        try {
            List listB = fontRequest.d;
            String str = fontRequest.a;
            String str2 = fontRequest.b;
            if (listB == null) {
                listB = FontResourcesParserCompat.b(resources, 0);
            }
            ProviderCacheKey providerCacheKey = new ProviderCacheKey();
            providerCacheKey.a = str;
            providerCacheKey.b = str2;
            providerCacheKey.c = listB;
            ProviderInfo providerInfo = (ProviderInfo) lruCache.c(providerCacheKey);
            if (providerInfo != null) {
                android.os.Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, aVar);
            for (int i = 0; i < listB.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listB.get(i));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            lruCache.d(providerCacheKey, providerInfoResolveContentProvider);
                            android.os.Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            android.os.Trace.endSection();
            return null;
        } catch (Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    public static FontsContractCompat.FontInfo[] c(Context context, FontRequest fontRequest, String str) {
        Trace.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClient = new ContentQueryWrapperApi24Impl(context, uriBuild).a;
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.a("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {fontRequest.c};
                    if (contentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    android.os.Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new FontsContractCompat.FontInfo(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    FontsContractCompat.FontInfo[] fontInfoArr = (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]);
                    android.os.Trace.endSection();
                    return fontInfoArr;
                } catch (Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClient != null) {
                    contentProviderClient.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            android.os.Trace.endSection();
            throw th3;
        }
    }
}
