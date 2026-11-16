package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a extends com.bykv.vk.openvk.preload.a.a<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.vk.openvk.preload.a.a
    public final /* synthetic */ String a(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        if (packageType == 0) {
            return "branch_zip";
        }
        if (packageType == 1) {
            return "branch_single_file";
        }
        y.j("unknow file type: ".concat(String.valueOf(packageType)));
        return null;
    }
}
