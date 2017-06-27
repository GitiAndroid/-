package com.tencent.mm.console;

import android.app.Activity;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.m;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.e.a.bh;
import com.tencent.mm.e.a.bj;
import com.tencent.mm.e.a.bk;
import com.tencent.mm.e.a.by;
import com.tencent.mm.e.a.cb;
import com.tencent.mm.e.a.cc;
import com.tencent.mm.e.a.cd;
import com.tencent.mm.e.a.ce;
import com.tencent.mm.e.a.ff;
import com.tencent.mm.e.a.le;
import com.tencent.mm.e.a.oi;
import com.tencent.mm.e.a.ol;
import com.tencent.mm.e.a.pa;
import com.tencent.mm.e.a.sk;
import com.tencent.mm.e.b.ca;
import com.tencent.mm.model.af.a;
import com.tencent.mm.model.af.b;
import com.tencent.mm.model.az;
import com.tencent.mm.model.ba;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bd.a;
import com.tencent.mm.model.bj.a;
import com.tencent.mm.model.bt;
import com.tencent.mm.model.c.a.a;
import com.tencent.mm.model.o;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.pluginsdk.m.a;
import com.tencent.mm.pluginsdk.m.ae;
import com.tencent.mm.pluginsdk.m.ag.a;
import com.tencent.mm.pluginsdk.m.ah;
import com.tencent.mm.pluginsdk.m.aj;
import com.tencent.mm.pluginsdk.m.al;
import com.tencent.mm.pluginsdk.m.f;
import com.tencent.mm.pluginsdk.m.j;
import com.tencent.mm.pluginsdk.m.o;
import com.tencent.mm.pluginsdk.m.q.d;
import com.tencent.mm.pluginsdk.m.r;
import com.tencent.mm.protocal.c.aku;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.bm;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.ai.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.storage.ao;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.v.a;
import com.tencent.mm.storage.w;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.chatting.En_5b8fbb1e.a;
import com.tencent.mm.ui.d.g;
import com.tencent.mm.w.d.a;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class b
{
  static
  {
    GMTrace.i(424799109120L, 3165);
    com.tencent.mm.console.a.b.init();
    com.tencent.mm.console.a.g.init();
    com.tencent.mm.console.a.h.init();
    com.tencent.mm.console.a.e.init();
    com.tencent.mm.console.a.c.init();
    com.tencent.mm.console.a.d.init();
    com.tencent.mm.console.a.a.init();
    com.tencent.mm.console.a.f.init();
    GMTrace.o(424799109120L, 3165);
  }
  
  private static int dJ(String paramString)
  {
    int j = 0;
    GMTrace.i(423993802752L, 3159);
    int i;
    if ((!paramString.startsWith("//")) || (paramString.length() <= 2))
    {
      GMTrace.o(423993802752L, 3159);
      i = j;
    }
    for (;;)
    {
      return i;
      int k = paramString.indexOf(" ");
      i = k;
      if (k == -1) {
        i = paramString.length();
      }
      try
      {
        i = bf.getInt(paramString.substring(2, i), 0);
        k = com.tencent.mm.protocal.d.sdh % 256;
        if ((k != 0) && (i >= k) && (i % k == 0)) {
          break label123;
        }
        GMTrace.o(423993802752L, 3159);
        i = j;
      }
      catch (Exception paramString)
      {
        GMTrace.o(423993802752L, 3159);
        i = j;
      }
      continue;
      label123:
      i /= k;
      GMTrace.o(423993802752L, 3159);
    }
  }
  
  private static String dK(String paramString)
  {
    GMTrace.i(424128020480L, 3160);
    int i = paramString.indexOf(" ");
    if (i < 0)
    {
      paramString = "";
      GMTrace.o(424128020480L, 3160);
    }
    for (;;)
    {
      return paramString;
      paramString = paramString.substring(i).trim();
      GMTrace.o(424128020480L, 3160);
    }
  }
  
  /* Error */
  private static StringBuilder em(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 151
    //   3: sipush 3162
    //   6: invokestatic 66	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 154	java/util/Date
    //   12: dup
    //   13: invokestatic 158	com/tencent/mm/sdk/platformtools/bf:Nc	()J
    //   16: iload_0
    //   17: i2l
    //   18: ldc2_w 159
    //   21: lmul
    //   22: lsub
    //   23: invokespecial 164	java/util/Date:<init>	(J)V
    //   26: astore_2
    //   27: new 166	java/text/SimpleDateFormat
    //   30: dup
    //   31: ldc -88
    //   33: invokestatic 174	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   36: invokespecial 177	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   39: astore_1
    //   40: new 179	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   47: getstatic 187	com/tencent/mm/compatible/util/e:hny	Ljava/lang/String;
    //   50: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc -63
    //   55: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload_1
    //   59: aload_2
    //   60: invokevirtual 197	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   63: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc -57
    //   68: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: astore_3
    //   75: new 179	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   82: astore 4
    //   84: new 204	java/io/File
    //   87: dup
    //   88: aload_3
    //   89: invokespecial 207	java/io/File:<init>	(Ljava/lang/String;)V
    //   92: invokevirtual 211	java/io/File:exists	()Z
    //   95: ifne +43 -> 138
    //   98: new 179	java/lang/StringBuilder
    //   101: dup
    //   102: new 179	java/lang/StringBuilder
    //   105: dup
    //   106: ldc -43
    //   108: invokespecial 214	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   111: iload_0
    //   112: invokevirtual 216	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   115: ldc -38
    //   117: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokespecial 214	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: astore_1
    //   127: ldc2_w 151
    //   130: sipush 3162
    //   133: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   136: aload_1
    //   137: areturn
    //   138: new 220	java/io/BufferedReader
    //   141: astore_2
    //   142: new 222	java/io/InputStreamReader
    //   145: astore 5
    //   147: new 224	java/io/FileInputStream
    //   150: astore_1
    //   151: aload_1
    //   152: aload_3
    //   153: invokespecial 225	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   156: aload 5
    //   158: aload_1
    //   159: invokespecial 228	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   162: aload_2
    //   163: aload 5
    //   165: invokespecial 231	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   168: aload_2
    //   169: astore_1
    //   170: aload_2
    //   171: invokevirtual 234	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   174: invokestatic 237	com/tencent/mm/sdk/platformtools/bf:ld	(Ljava/lang/String;)Z
    //   177: ifeq +69 -> 246
    //   180: aload_2
    //   181: astore_1
    //   182: aload_2
    //   183: invokevirtual 240	java/io/BufferedReader:close	()V
    //   186: aload_2
    //   187: astore_1
    //   188: new 179	java/lang/StringBuilder
    //   191: astore_3
    //   192: aload_2
    //   193: astore_1
    //   194: new 179	java/lang/StringBuilder
    //   197: astore 5
    //   199: aload_2
    //   200: astore_1
    //   201: aload 5
    //   203: ldc -14
    //   205: invokespecial 214	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   208: aload_2
    //   209: astore_1
    //   210: aload_3
    //   211: aload 5
    //   213: iload_0
    //   214: invokevirtual 216	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   217: ldc -12
    //   219: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   225: invokespecial 214	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   228: aload_2
    //   229: invokevirtual 240	java/io/BufferedReader:close	()V
    //   232: ldc2_w 151
    //   235: sipush 3162
    //   238: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   241: aload_3
    //   242: astore_1
    //   243: goto -107 -> 136
    //   246: aload_2
    //   247: astore_1
    //   248: aload_2
    //   249: invokevirtual 234	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   252: astore_3
    //   253: aload_3
    //   254: ifnull +104 -> 358
    //   257: aload_2
    //   258: astore_1
    //   259: aload_3
    //   260: ldc -10
    //   262: invokevirtual 250	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   265: astore_3
    //   266: aload_2
    //   267: astore_1
    //   268: new 106	java/lang/String
    //   271: astore 5
    //   273: aload_2
    //   274: astore_1
    //   275: aload 5
    //   277: aload_3
    //   278: iconst_1
    //   279: aaload
    //   280: iconst_0
    //   281: invokestatic 256	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   284: invokespecial 259	java/lang/String:<init>	([B)V
    //   287: aload_2
    //   288: astore_1
    //   289: aload 4
    //   291: aload 5
    //   293: ldc_w 261
    //   296: invokevirtual 250	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   299: iconst_1
    //   300: aaload
    //   301: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: pop
    //   305: aload_2
    //   306: astore_1
    //   307: aload 4
    //   309: ldc_w 263
    //   312: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: pop
    //   316: goto -70 -> 246
    //   319: astore_3
    //   320: aload_2
    //   321: astore_1
    //   322: ldc_w 265
    //   325: aload_3
    //   326: ldc -115
    //   328: iconst_0
    //   329: anewarray 4	java/lang/Object
    //   332: invokestatic 271	com/tencent/mm/sdk/platformtools/v:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   335: aload_2
    //   336: ifnull +7 -> 343
    //   339: aload_2
    //   340: invokevirtual 240	java/io/BufferedReader:close	()V
    //   343: ldc2_w 151
    //   346: sipush 3162
    //   349: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   352: aload 4
    //   354: astore_1
    //   355: goto -219 -> 136
    //   358: aload_2
    //   359: invokevirtual 240	java/io/BufferedReader:close	()V
    //   362: goto -19 -> 343
    //   365: astore_1
    //   366: goto -23 -> 343
    //   369: astore_2
    //   370: aconst_null
    //   371: astore_1
    //   372: aload_1
    //   373: ifnull +7 -> 380
    //   376: aload_1
    //   377: invokevirtual 240	java/io/BufferedReader:close	()V
    //   380: aload_2
    //   381: athrow
    //   382: astore_1
    //   383: goto -151 -> 232
    //   386: astore_1
    //   387: goto -44 -> 343
    //   390: astore_1
    //   391: goto -11 -> 380
    //   394: astore_2
    //   395: goto -23 -> 372
    //   398: astore_3
    //   399: aconst_null
    //   400: astore_2
    //   401: goto -81 -> 320
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	404	0	paramInt	int
    //   39	316	1	localObject1	Object
    //   365	1	1	localException1	Exception
    //   371	6	1	localObject2	Object
    //   382	1	1	localException2	Exception
    //   386	1	1	localException3	Exception
    //   390	1	1	localException4	Exception
    //   26	333	2	localObject3	Object
    //   369	12	2	localObject4	Object
    //   394	1	2	localObject5	Object
    //   400	1	2	localObject6	Object
    //   74	204	3	localObject7	Object
    //   319	7	3	localException5	Exception
    //   398	1	3	localException6	Exception
    //   82	271	4	localStringBuilder	StringBuilder
    //   145	147	5	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   170	180	319	java/lang/Exception
    //   182	186	319	java/lang/Exception
    //   188	192	319	java/lang/Exception
    //   194	199	319	java/lang/Exception
    //   201	208	319	java/lang/Exception
    //   210	228	319	java/lang/Exception
    //   248	253	319	java/lang/Exception
    //   259	266	319	java/lang/Exception
    //   268	273	319	java/lang/Exception
    //   275	287	319	java/lang/Exception
    //   289	305	319	java/lang/Exception
    //   307	316	319	java/lang/Exception
    //   358	362	365	java/lang/Exception
    //   138	168	369	finally
    //   228	232	382	java/lang/Exception
    //   339	343	386	java/lang/Exception
    //   376	380	390	java/lang/Exception
    //   170	180	394	finally
    //   182	186	394	finally
    //   188	192	394	finally
    //   194	199	394	finally
    //   201	208	394	finally
    //   210	228	394	finally
    //   248	253	394	finally
    //   259	266	394	finally
    //   268	273	394	finally
    //   275	287	394	finally
    //   289	305	394	finally
    //   307	316	394	finally
    //   322	335	394	finally
    //   138	168	398	java/lang/Exception
  }
  
  private static void en(int paramInt)
  {
    GMTrace.i(424530673664L, 3163);
    SharedPreferences localSharedPreferences = ak.aV(com.tencent.mm.sdk.platformtools.aa.getContext(), "sp_sns_dynswitch_stg");
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Bad op parameter: " + paramInt);
    case -1: 
      localSharedPreferences.edit().remove("st_sw_use_vcodec_img").commit();
      GMTrace.o(424530673664L, 3163);
    }
    for (;;)
    {
      return;
      localSharedPreferences.edit().putBoolean("st_sw_use_vcodec_img", false).commit();
      GMTrace.o(424530673664L, 3163);
      continue;
      localSharedPreferences.edit().putBoolean("st_sw_use_vcodec_img", true).commit();
      GMTrace.o(424530673664L, 3163);
    }
  }
  
  private static void eo(int paramInt)
  {
    GMTrace.i(424664891392L, 3164);
    SharedPreferences localSharedPreferences = ak.aV(com.tencent.mm.sdk.platformtools.aa.getContext(), "sp_sns_dynswitch_stg");
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Bad op parameter: " + paramInt);
    case -1: 
      localSharedPreferences.edit().remove("st_sw_use_wxpc_img").commit();
      GMTrace.o(424664891392L, 3164);
    }
    for (;;)
    {
      return;
      localSharedPreferences.edit().putBoolean("st_sw_use_wxpc_img", false).commit();
      GMTrace.o(424664891392L, 3164);
      continue;
      localSharedPreferences.edit().putBoolean("st_sw_use_wxpc_img", true).commit();
      GMTrace.o(424664891392L, 3164);
    }
  }
  
  public static boolean v(final Context paramContext, final String paramString)
  {
    GMTrace.i(424262238208L, 3161);
    boolean bool1;
    if (!paramString.startsWith("//"))
    {
      bool1 = false;
      GMTrace.o(424262238208L, 3161);
    }
    for (;;)
    {
      return bool1;
      if (com.tencent.mm.pluginsdk.b.b.aJ(paramContext, paramString))
      {
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//clearWXSNSDB"))
      {
        paramContext = new oi();
        com.tencent.mm.sdk.b.a.trT.y(paramContext);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//verifytokenerror"))
      {
        com.tencent.mm.platformtools.r.ivf = true;
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      final Object localObject1;
      final int i;
      if (paramString.equalsIgnoreCase("//ftsmsbiz"))
      {
        localObject1 = com.tencent.mm.modelsearch.i.HR();
        paramString = new StringBuilder();
        localObject1 = ((akv)localObject1).jEZ.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = (aku)((Iterator)localObject1).next();
          paramString.append(String.format("%s | %.2f | %s", new Object[] { com.tencent.mm.model.n.ev(((aku)localObject4).skK), Double.valueOf(((aku)localObject4).sSP), com.tencent.mm.pluginsdk.k.p.X("yyyy-MM-dd HH:mm", ((aku)localObject4).sSQ / 1000L) }));
          paramString.append("\n");
        }
        localObject1 = new TextView(paramContext);
        ((TextView)localObject1).setText(paramString.toString());
        ((TextView)localObject1).setGravity(19);
        ((TextView)localObject1).setTextSize(1, 10.0F);
        ((TextView)localObject1).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ((TextView)localObject1).setTextColor(-16711936);
        ((TextView)localObject1).setTypeface(Typeface.MONOSPACE);
        i = paramContext.getResources().getDimensionPixelSize(R.f.aYj);
        ((TextView)localObject1).setPadding(i, i, i, i);
        com.tencent.mm.ui.base.g.a(paramContext, null, (View)localObject1, null);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (m.al.buO() != null)
      {
        if (paramString.equalsIgnoreCase("//wearversion"))
        {
          paramString = new TextView(paramContext);
          paramString.setText(m.al.buO().bpg());
          paramString.setGravity(19);
          paramString.setTextSize(1, 10.0F);
          paramString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
          paramString.setTextColor(-16711936);
          paramString.setTypeface(Typeface.MONOSPACE);
          i = paramContext.getResources().getDimensionPixelSize(R.f.aYj);
          paramString.setPadding(i, i, i, i);
          com.tencent.mm.ui.base.g.a(paramContext, null, paramString, null);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.equalsIgnoreCase("//wearlog"))
        {
          m.al.buO().bph();
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.equalsIgnoreCase("//wearreconnect"))
        {
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
      }
      if (paramString.startsWith("//wxafts"))
      {
        paramContext = new sk();
        paramContext.gly.glz = paramString;
        com.tencent.mm.sdk.b.a.trT.y(paramContext);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (com.tencent.mm.sdk.a.b.bAT())
      {
        if (paramString.startsWith("//launchapp clear"))
        {
          com.tencent.mm.kernel.h.vg().uQ().a(v.a.tFn, "");
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//setsupportwxcode"))
        {
          com.tencent.mm.kernel.h.vg().uQ().a(v.a.tFW, Boolean.valueOf(true));
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//setnotsupportwxcode"))
        {
          com.tencent.mm.kernel.h.vg().uQ().a(v.a.tFW, Boolean.valueOf(false));
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//resetsupportwxcode"))
        {
          com.tencent.mm.kernel.h.vg().uQ().a(v.a.tFW, null);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
      }
      if (paramString.startsWith("//testsightwidget"))
      {
        paramString = new Intent();
        paramString.putExtra("KSightPath", "/mnt/sdcard/tencent/tempvideo4.mp4");
        paramString.putExtra("KSightThumbPath", "");
        paramString.putExtra("sight_md5", com.tencent.mm.a.g.aU("/mnt/sdcard/tencent/tempvideo4.mp4"));
        paramString.putExtra("KSnsPostManu", true);
        paramString.putExtra("KTouchCameraTime", bf.Nb());
        paramString.putExtra("Ksnsupload_type", 14);
        com.tencent.mm.ba.c.b(paramContext, "sns", ".ui.En_c4f742e5", paramString);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//ftstemplatetest"))
      {
        localObject1 = new com.tencent.mm.e.a.bc();
        ((com.tencent.mm.e.a.bc)localObject1).fQc.fQd = 27;
        ((com.tencent.mm.e.a.bc)localObject1).fQc.fQd = 1;
        ((com.tencent.mm.e.a.bc)localObject1).fQc.filePath = "/sdcard/fts_template.zip";
        com.tencent.mm.sdk.b.a.trT.y((com.tencent.mm.sdk.b.b)localObject1);
      }
      if (paramString.startsWith("//sightforward"))
      {
        paramString = new Intent();
        paramString.setClassName(paramContext, "com.tencent.mm.ui.transmit.SightForwardUI");
        paramContext.startActivity(paramString);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      final int j;
      if (paramString.startsWith("//uplog"))
      {
        localObject1 = "weixin";
        if (com.tencent.mm.model.an.yw()) {
          localObject1 = com.tencent.mm.model.m.xd();
        }
        localObject4 = paramString.split(" ");
        j = 0;
        i = 0;
        paramString = (String)localObject1;
        if (localObject4 != null)
        {
          if (localObject4.length > 1) {
            i = bf.getInt(localObject4[1], 0);
          }
          paramString = (String)localObject1;
          j = i;
          if (localObject4.length > 2)
          {
            paramString = localObject4[2];
            j = i;
          }
        }
        com.tencent.mm.model.an.uC().d(new bd(new bd.a()
        {
          public final void a(com.tencent.mm.network.e paramAnonymouse)
          {
            GMTrace.i(415806521344L, 3098);
            com.tencent.mm.model.an.uC().a(1, "", 0, false);
            com.tencent.mm.sdk.platformtools.v.bBn();
            com.tencent.mm.model.an.uC().a(2, this.hcE, j, com.tencent.mm.model.an.yw());
            GMTrace.o(415806521344L, 3098);
          }
        }));
        paramContext.getString(R.m.dRu);
        com.tencent.mm.model.an.a(new com.tencent.mm.model.ac()
        {
          public final void ep(int paramAnonymousInt)
          {
            GMTrace.i(425604415488L, 3171);
            com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "ipxx progress:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
            if (paramAnonymousInt < 0)
            {
              com.tencent.mm.model.an.a(null);
              this.hcU.dismiss();
              com.tencent.mm.ui.base.g.g(paramContext, R.m.flS, R.m.dRu);
              GMTrace.o(425604415488L, 3171);
            }
            for (;;)
            {
              return;
              if (paramAnonymousInt >= 100)
              {
                com.tencent.mm.model.an.a(null);
                this.hcU.dismiss();
                com.tencent.mm.ui.base.g.g(paramContext, R.m.flW, R.m.dRu);
                GMTrace.o(425604415488L, 3171);
              }
              else
              {
                this.hcU.setMessage(paramContext.getString(R.m.flT) + paramAnonymousInt + "%");
                GMTrace.o(425604415488L, 3171);
              }
            }
          }
        });
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//upcrash"))
      {
        paramContext = "weixin";
        if (com.tencent.mm.model.an.yw()) {
          paramContext = com.tencent.mm.model.m.xd();
        }
        localObject1 = paramString.split(" ");
        j = 0;
        i = 0;
        paramString = paramContext;
        if (localObject1 != null)
        {
          if (localObject1.length > 1) {
            i = bf.getInt(localObject1[1], 0);
          }
          paramString = paramContext;
          j = i;
          if (localObject1.length > 2)
          {
            paramString = localObject1[2];
            j = i;
          }
        }
        com.tencent.mm.model.an.uC().d(new bd(new bd.a()
        {
          public final void a(com.tencent.mm.network.e paramAnonymouse)
          {
            GMTrace.i(422517407744L, 3148);
            com.tencent.mm.model.an.uC().a(3, this.hcE, j, com.tencent.mm.model.an.yw());
            GMTrace.o(422517407744L, 3148);
          }
        }));
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//switchnotificationstatus"))
      {
        if (!com.tencent.mm.i.f.sa()) {}
        for (bool1 = true;; bool1 = false)
        {
          com.tencent.mm.i.f.aF(bool1);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          break;
        }
      }
      if (paramString.startsWith("//fixError0831"))
      {
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "fixError0831");
        com.tencent.mm.sdk.b.a.trT.y(new bh());
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//cleanpaycn"))
      {
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "cleanpaycn");
        com.tencent.mm.sdk.b.a.trT.y(new bk());
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//busiluck "))
      {
        paramString = paramString.replace("//busiluck ", "");
        paramString = "weixin://openNativeUrl/weixinHB/startreceivebizhbrequest?sendid=" + paramString;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_way", 5);
        ((Intent)localObject1).putExtra("key_native_url", paramString);
        com.tencent.mm.ba.c.b(paramContext, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", (Intent)localObject1);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//testsoter"))
      {
        com.tencent.mm.ba.c.v(paramContext, "soter", ".test.SoterTestUI");
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//facevideo"))
      {
        paramContext = paramString.split(" ");
        if (paramContext.length == 3)
        {
          com.tencent.mm.model.am.hsM.K("imgType", paramContext[1]);
          com.tencent.mm.model.am.hsM.K("depth", paramContext[2]);
        }
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//alpha"))
      {
        paramContext = paramString.split(" ");
        if (paramContext.length == 2) {
          com.tencent.mm.model.am.hsM.K("alpha_duration", paramContext[1]);
        }
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//rectwidth"))
      {
        paramContext = paramString.split(" ");
        if (paramContext.length == 2) {
          com.tencent.mm.model.am.hsM.K("rect_width", paramContext[1]);
        }
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//newyearsw "))
      {
        com.tencent.mm.model.an.yt();
        i = ((Integer)com.tencent.mm.model.c.uQ().get(v.a.tzs, Integer.valueOf(0))).intValue();
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.uQ().a(v.a.tzs, Integer.valueOf(i ^ 0x1));
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//commitxlog"))
      {
        com.tencent.mm.model.an.uC().a(1, "", 0, false);
        com.tencent.mm.sdk.platformtools.v.bBn();
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//netstatus"))
      {
        paramString = al.dY(com.tencent.mm.sdk.platformtools.aa.getContext());
        com.tencent.mm.ui.base.g.b(paramContext, paramString, "netstatus", paramContext.getString(R.m.foO), paramContext.getString(R.m.efp), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(414195908608L, 3086);
            ((ClipboardManager)this.hcG.getSystemService("clipboard")).setText(paramString);
            GMTrace.o(414195908608L, 3086);
          }
        }, null);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      long l1;
      if (paramString.startsWith("//scaninterval "))
      {
        localObject1 = paramString.split(" ");
        l1 = -1L;
      }
      try
      {
        l2 = bf.getLong(localObject1[1], -1L);
        l1 = l2;
      }
      catch (Exception localException3)
      {
        for (;;)
        {
          long l2;
          continue;
          paramString = null;
          continue;
          paramString = null;
          continue;
          Object localObject3 = null;
          paramString = null;
          continue;
          localObject4 = null;
          localObject3 = null;
          paramString = null;
        }
      }
      if (l1 > 0L)
      {
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.uQ().a(v.a.tEy, Long.valueOf(l1));
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summerclean reset scaninterval[%d]", new Object[] { Long.valueOf(l1) });
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//scanwait "))
      {
        localObject1 = paramString.split(" ");
        l1 = -1L;
      }
      try
      {
        l2 = bf.getLong(localObject1[1], -1L);
        l1 = l2;
      }
      catch (Exception localException2)
      {
        boolean bool3;
        boolean bool2;
        boolean bool4;
        String str;
        for (;;) {}
      }
      if (l1 > 0L)
      {
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.uQ().a(v.a.tEz, Long.valueOf(l1));
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summerclean reset scanwait[%d]", new Object[] { Long.valueOf(l1) });
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.equalsIgnoreCase("//delayquery"))
      {
        if (!com.tencent.mm.platformtools.r.ivi) {}
        for (bool1 = true;; bool1 = false)
        {
          com.tencent.mm.platformtools.r.ivi = bool1;
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          break;
        }
      }
      if (paramString.equalsIgnoreCase("//swipe"))
      {
        paramContext = com.tencent.mm.sdk.platformtools.aa.bBx();
        bool1 = paramContext.getBoolean("settings_support_swipe", true);
        paramContext = paramContext.edit();
        if (!bool1) {}
        for (bool1 = true;; bool1 = false)
        {
          paramContext.putBoolean("settings_support_swipe", bool1).commit();
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          break;
        }
      }
      if (paramString.equalsIgnoreCase("//multiwebview"))
      {
        paramContext = LauncherUI.bHU().getSharedPreferences(com.tencent.mm.sdk.platformtools.aa.bBv(), 0);
        bool1 = paramContext.getBoolean("settings_multi_webview", false);
        if (bool1)
        {
          paramContext = paramContext.edit();
          if (bool1) {
            break label2251;
          }
        }
        label2251:
        for (bool1 = true;; bool1 = false)
        {
          paramContext.putBoolean("settings_multi_webview", bool1).commit();
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          break;
        }
      }
      if (paramString.equalsIgnoreCase("//sightinfo"))
      {
        com.tencent.mm.model.an.yt();
        bool1 = ((Boolean)com.tencent.mm.model.c.uQ().get(344065, Boolean.valueOf(false))).booleanValue();
        com.tencent.mm.model.an.yt();
        paramContext = com.tencent.mm.model.c.uQ();
        if (!bool1) {}
        for (bool1 = true;; bool1 = false)
        {
          paramContext.set(344065, Boolean.valueOf(bool1));
          com.tencent.mm.model.an.yt();
          com.tencent.mm.model.c.uQ().jo(true);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          break;
        }
      }
      if (paramString.startsWith("//sighttest"))
      {
        i = bf.No(paramString.replace("//sighttest ", ""));
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.uQ().set(344066, Integer.valueOf(i));
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.uQ().jo(true);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//wxcamera"))
      {
        i = bf.No(paramString.replace("//wxcamera ", ""));
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "set param %d", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.uQ().a(v.a.tEn, Integer.valueOf(i));
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//printcrash"))
      {
        localObject1 = paramString.replace("//printcrash ", "");
        paramString = new TextView(paramContext);
        paramString.setText(em(bf.getInt((String)localObject1, 0)));
        paramString.setGravity(19);
        paramString.setTextSize(1, 8.0F);
        paramString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        paramString.setTextColor(-16711936);
        paramString.setTypeface(Typeface.MONOSPACE);
        i = paramContext.getResources().getDimensionPixelSize(R.f.aYK);
        paramString.setPadding(i, i, i, i);
        paramString.setMovementMethod(ScrollingMovementMethod.getInstance());
        com.tencent.mm.ui.base.g.a(paramContext, null, paramString, null);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//resetmapcnt"))
      {
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.uQ().a(v.a.tFX, Integer.valueOf(0));
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.equals("//testrsa"))
      {
        com.tencent.mm.protocal.ac.F("010001", "E338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.equals("//testrsabad"))
      {
        com.tencent.mm.protocal.ac.F("010001", "F338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.equals("//walletofflinetest"))
      {
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.uQ().a(v.a.tDS, Boolean.valueOf(false));
        bool1 = false;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//makemsgdata "))
      {
        i = bf.getInt(paramString.split(" ")[1], 0);
        com.tencent.mm.model.an.yt();
        com.tencent.mm.model.c.wl().u(En_5b8fbb1e.a.uEw, i);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//pullappservice"))
      {
        com.tencent.mm.pluginsdk.model.app.an.bvR().du(com.tencent.mm.sdk.platformtools.aa.getContext());
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//boundaryconfig"))
      {
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig SessionTextMsg:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitSessionTextMsg"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig SNSObjectText:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitSNSObjectText"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig SnsCommentMaxSize:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("SnsCommentMaxSize"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig FavText:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitFavText"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig EmotionBufSize:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitSendEmotionBufSize"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig EmotionWidth:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitSendEmotionWidth"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig FavImageSize:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitFavImageSize"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig FavVoiceLength:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitFavVoiceLength"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig ShortVideoAutoDownloadBufSize:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitSessionShortVideoBufSize"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig VideoSize:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitVideoSize"), 0)) });
        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "boundaryconfig FileSize:%d", new Object[] { Integer.valueOf(bf.getInt(com.tencent.mm.i.g.sN().getValue("InputLimitFileSize"), 0)) });
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//whatsnew"))
      {
        MMAppMgr.ab((Activity)paramContext);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//profile "))
      {
        com.tencent.mm.model.an.yt();
        localObject1 = com.tencent.mm.model.c.wj().Oy(paramString.replace("//profile ", "").trim());
        if ((localObject1 != null) && (((w)localObject1).tx() != 0))
        {
          paramString = new Intent();
          paramString.putExtra("Contact_User", ((w)localObject1).getUsername());
          com.tencent.mm.ba.c.b(paramContext, "profile", ".ui.ContactInfoUI", paramString);
        }
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//cs"))
      {
        paramContext = new Intent();
        paramContext.putExtra("voipCSBizId", "gh_b35727b00b78");
        paramContext.putExtra("voipCSAppId", "wx6e7147e8d764e85d");
        com.tencent.mm.ba.c.b(com.tencent.mm.sdk.platformtools.aa.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//acs"))
      {
        paramContext = new Intent();
        paramContext.putExtra("voipCSBizId", "gh_e8b085bb67e0");
        paramContext.putExtra("voipCSAppId", "wx1224160e0adcefd6");
        com.tencent.mm.ba.c.b(com.tencent.mm.sdk.platformtools.aa.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//wifiset"))
      {
        paramContext = new Intent();
        paramContext.putExtra("free_wifi_ssid", "Xiaomi_WENDY");
        paramContext.putExtra("free_wifi_passowrd", "WX12345789");
        com.tencent.mm.ba.c.b(com.tencent.mm.sdk.platformtools.aa.getContext(), "freewifi", ".ui.FreeWifiCopyPwdUI", paramContext);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//bcs"))
      {
        paramContext = new Intent();
        paramContext.putExtra("voipCSBizId", "gh_e8b085bb67e0");
        paramContext.putExtra("voipCSAppId", "wx1224160e0adcefd6");
        paramContext.putExtra("voipCSAllowBackCamera", "1");
        paramContext.putExtra("voipCSShowOther", "1");
        paramContext.putExtra("voipCSAvatarUrl", "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=28737416,3249768666&fm=58");
        paramContext.putExtra("voipCSContext", "test");
        com.tencent.mm.ba.c.b(com.tencent.mm.sdk.platformtools.aa.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//getfpkey"))
      {
        paramString = com.tencent.mm.storage.bb.bFp();
        com.tencent.mm.ui.base.g.b(paramContext, paramString, "Fingerprint Key", paramContext.getString(R.m.foO), paramContext.getString(R.m.efp), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(422248972288L, 3146);
            ((ClipboardManager)this.hcG.getSystemService("clipboard")).setText(paramString);
            Toast.makeText(this.hcG, R.m.foP, 0).show();
            GMTrace.o(422248972288L, 3146);
          }
        }, null);
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//commitwd"))
      {
        WatchDogPushReceiver.JZ();
        bool1 = true;
        GMTrace.o(424262238208L, 3161);
        continue;
      }
      if (paramString.startsWith("//setsnstestenv"))
      {
        paramString = paramString.split(" +");
        if (paramString.length <= 1) {
          break label15477;
        }
        localObject4 = paramString[1];
        if ((!com.tencent.mm.sdk.platformtools.p.isIPv4Address((String)localObject4)) && (!com.tencent.mm.sdk.platformtools.p.isIPv6Address((String)localObject4))) {
          break label15477;
        }
        if (paramString.length <= 2) {
          break label15469;
        }
        localObject1 = paramString[2];
        if ((!com.tencent.mm.sdk.platformtools.p.isIPv4Address((String)localObject1)) && (!com.tencent.mm.sdk.platformtools.p.isIPv6Address((String)localObject1))) {
          break label15469;
        }
        if (paramString.length > 3)
        {
          paramString = paramString[3];
          if (localObject4 != null) {}
          for (bool1 = true;; bool1 = false)
          {
            com.tencent.mm.platformtools.r.iuE = bool1;
            com.tencent.mm.platformtools.r.iuv = (String)localObject4;
            com.tencent.mm.platformtools.r.iuZ = (String)localObject1;
            com.tencent.mm.platformtools.r.iva = paramString;
            com.tencent.mm.model.an.uC().d(new com.tencent.mm.modelcdntran.e());
            Toast.makeText(paramContext, String.format("%s %s %s", new Object[] { com.tencent.mm.platformtools.r.iuv, com.tencent.mm.platformtools.r.iuZ, com.tencent.mm.platformtools.r.iva }), 1).show();
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            break;
          }
        }
      }
      else
      {
        if (paramString.startsWith("//snsvcodec"))
        {
          paramContext = paramString.split(" +");
          if (paramContext.length > 1)
          {
            paramContext = paramContext[1];
            if ("on".equalsIgnoreCase(paramContext))
            {
              en(1);
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "snsvcodec val: 1");
            }
          }
          for (;;)
          {
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            break;
            if ("off".equalsIgnoreCase(paramContext))
            {
              en(0);
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "snsvcodec val: 0");
              continue;
              en(-1);
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "snsvcodec val: -1");
            }
          }
        }
        if (paramString.startsWith("//snswxpc"))
        {
          paramContext = paramString.split(" +");
          if (paramContext.length > 1)
          {
            paramContext = paramContext[1];
            if ("on".equalsIgnoreCase(paramContext))
            {
              eo(1);
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "snswxpc val: 1");
            }
          }
          for (;;)
          {
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            break;
            if ("off".equalsIgnoreCase(paramContext))
            {
              eo(0);
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "snswxpc val: 0");
              continue;
              eo(-1);
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "snswxpc val: -1");
            }
          }
        }
        if (paramString.startsWith("//mmdumpsys"))
        {
          com.tencent.mm.model.an.vj().x(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(427886116864L, 3188);
              new ai(new ai.a()
              {
                /* Error */
                public final boolean oJ()
                {
                  // Byte code:
                  //   0: ldc2_w 36
                  //   3: sipush 3144
                  //   6: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
                  //   9: bipush 23
                  //   11: invokestatic 43	com/tencent/mm/compatible/util/d:ee	(I)Z
                  //   14: ifeq +285 -> 299
                  //   17: ldc 45
                  //   19: ldc 47
                  //   21: iconst_1
                  //   22: anewarray 4	java/lang/Object
                  //   25: dup
                  //   26: iconst_0
                  //   27: invokestatic 53	android/os/Debug:getRuntimeStats	()Ljava/util/Map;
                  //   30: aastore
                  //   31: invokestatic 58	com/tencent/mm/sdk/platformtools/v:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   34: invokestatic 62	android/os/Debug:getPss	()J
                  //   37: lstore_1
                  //   38: new 64	android/os/Debug$MemoryInfo
                  //   41: dup
                  //   42: invokespecial 65	android/os/Debug$MemoryInfo:<init>	()V
                  //   45: astore_3
                  //   46: aload_3
                  //   47: invokestatic 69	android/os/Debug:getMemoryInfo	(Landroid/os/Debug$MemoryInfo;)V
                  //   50: bipush 23
                  //   52: invokestatic 43	com/tencent/mm/compatible/util/d:ee	(I)Z
                  //   55: ifeq +276 -> 331
                  //   58: ldc 45
                  //   60: ldc 71
                  //   62: iconst_2
                  //   63: anewarray 4	java/lang/Object
                  //   66: dup
                  //   67: iconst_0
                  //   68: lload_1
                  //   69: invokestatic 77	java/lang/Long:valueOf	(J)Ljava/lang/Long;
                  //   72: aastore
                  //   73: dup
                  //   74: iconst_1
                  //   75: aload_3
                  //   76: invokevirtual 80	android/os/Debug$MemoryInfo:getMemoryStats	()Ljava/util/Map;
                  //   79: aastore
                  //   80: invokestatic 58	com/tencent/mm/sdk/platformtools/v:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   83: invokestatic 86	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
                  //   86: ldc 88
                  //   88: invokevirtual 92	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
                  //   91: astore 5
                  //   93: new 94	java/io/LineNumberReader
                  //   96: astore 4
                  //   98: new 96	java/io/InputStreamReader
                  //   101: astore_3
                  //   102: aload_3
                  //   103: aload 5
                  //   105: invokevirtual 102	java/lang/Process:getInputStream	()Ljava/io/InputStream;
                  //   108: invokespecial 105	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
                  //   111: aload 4
                  //   113: aload_3
                  //   114: invokespecial 108	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
                  //   117: aload 4
                  //   119: astore_3
                  //   120: aload 4
                  //   122: invokevirtual 112	java/io/LineNumberReader:readLine	()Ljava/lang/String;
                  //   125: astore 6
                  //   127: aload 6
                  //   129: ifnull +233 -> 362
                  //   132: aload 4
                  //   134: astore_3
                  //   135: aload 6
                  //   137: invokevirtual 118	java/lang/String:length	()I
                  //   140: ifle -23 -> 117
                  //   143: aload 4
                  //   145: astore_3
                  //   146: ldc 45
                  //   148: aload 6
                  //   150: invokestatic 121	com/tencent/mm/sdk/platformtools/v:i	(Ljava/lang/String;Ljava/lang/String;)V
                  //   153: goto -36 -> 117
                  //   156: astore 5
                  //   158: aload 4
                  //   160: astore_3
                  //   161: ldc 45
                  //   163: ldc 123
                  //   165: iconst_1
                  //   166: anewarray 4	java/lang/Object
                  //   169: dup
                  //   170: iconst_0
                  //   171: aload 5
                  //   173: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
                  //   176: aastore
                  //   177: invokestatic 129	com/tencent/mm/sdk/platformtools/v:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   180: aload 4
                  //   182: ifnull +8 -> 190
                  //   185: aload 4
                  //   187: invokevirtual 132	java/io/LineNumberReader:close	()V
                  //   190: ldc 45
                  //   192: ldc -122
                  //   194: iconst_1
                  //   195: anewarray 4	java/lang/Object
                  //   198: dup
                  //   199: iconst_0
                  //   200: invokestatic 139	java/lang/Thread:activeCount	()I
                  //   203: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                  //   206: aastore
                  //   207: invokestatic 58	com/tencent/mm/sdk/platformtools/v:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   210: invokestatic 147	java/lang/Thread:getAllStackTraces	()Ljava/util/Map;
                  //   213: astore 5
                  //   215: aload 5
                  //   217: invokeinterface 153 1 0
                  //   222: invokeinterface 159 1 0
                  //   227: astore_3
                  //   228: aload_3
                  //   229: invokeinterface 164 1 0
                  //   234: ifeq +234 -> 468
                  //   237: aload_3
                  //   238: invokeinterface 168 1 0
                  //   243: checkcast 136	java/lang/Thread
                  //   246: astore 4
                  //   248: aload 4
                  //   250: invokevirtual 172	java/lang/Thread:getState	()Ljava/lang/Thread$State;
                  //   253: getstatic 178	java/lang/Thread$State:RUNNABLE	Ljava/lang/Thread$State;
                  //   256: if_acmpne -28 -> 228
                  //   259: ldc 45
                  //   261: ldc -76
                  //   263: iconst_2
                  //   264: anewarray 4	java/lang/Object
                  //   267: dup
                  //   268: iconst_0
                  //   269: aload 4
                  //   271: invokevirtual 183	java/lang/Thread:getName	()Ljava/lang/String;
                  //   274: aastore
                  //   275: dup
                  //   276: iconst_1
                  //   277: aload 5
                  //   279: aload 4
                  //   281: invokeinterface 187 2 0
                  //   286: checkcast 189	[Ljava/lang/StackTraceElement;
                  //   289: invokestatic 195	com/tencent/mm/sdk/platformtools/ag:b	([Ljava/lang/StackTraceElement;)Ljava/lang/String;
                  //   292: aastore
                  //   293: invokestatic 58	com/tencent/mm/sdk/platformtools/v:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   296: goto -68 -> 228
                  //   299: ldc 45
                  //   301: ldc -59
                  //   303: iconst_2
                  //   304: anewarray 4	java/lang/Object
                  //   307: dup
                  //   308: iconst_0
                  //   309: invokestatic 200	android/os/Debug:getGlobalGcInvocationCount	()I
                  //   312: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                  //   315: aastore
                  //   316: dup
                  //   317: iconst_1
                  //   318: invokestatic 203	android/os/Debug:getThreadGcInvocationCount	()I
                  //   321: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                  //   324: aastore
                  //   325: invokestatic 58	com/tencent/mm/sdk/platformtools/v:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   328: goto -294 -> 34
                  //   331: ldc 45
                  //   333: ldc -51
                  //   335: iconst_2
                  //   336: anewarray 4	java/lang/Object
                  //   339: dup
                  //   340: iconst_0
                  //   341: lload_1
                  //   342: invokestatic 77	java/lang/Long:valueOf	(J)Ljava/lang/Long;
                  //   345: aastore
                  //   346: dup
                  //   347: iconst_1
                  //   348: aload_3
                  //   349: getfield 209	android/os/Debug$MemoryInfo:nativePss	I
                  //   352: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                  //   355: aastore
                  //   356: invokestatic 58	com/tencent/mm/sdk/platformtools/v:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   359: goto -276 -> 83
                  //   362: aload 4
                  //   364: astore_3
                  //   365: aload 5
                  //   367: invokevirtual 212	java/lang/Process:waitFor	()I
                  //   370: pop
                  //   371: aload 4
                  //   373: astore_3
                  //   374: aload 5
                  //   376: invokevirtual 215	java/lang/Process:destroy	()V
                  //   379: aload 4
                  //   381: invokevirtual 132	java/io/LineNumberReader:close	()V
                  //   384: goto -194 -> 190
                  //   387: astore_3
                  //   388: ldc 45
                  //   390: ldc -39
                  //   392: iconst_1
                  //   393: anewarray 4	java/lang/Object
                  //   396: dup
                  //   397: iconst_0
                  //   398: aload_3
                  //   399: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
                  //   402: aastore
                  //   403: invokestatic 129	com/tencent/mm/sdk/platformtools/v:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   406: goto -216 -> 190
                  //   409: astore_3
                  //   410: ldc 45
                  //   412: ldc -39
                  //   414: iconst_1
                  //   415: anewarray 4	java/lang/Object
                  //   418: dup
                  //   419: iconst_0
                  //   420: aload_3
                  //   421: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
                  //   424: aastore
                  //   425: invokestatic 129	com/tencent/mm/sdk/platformtools/v:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   428: goto -238 -> 190
                  //   431: astore 4
                  //   433: aconst_null
                  //   434: astore_3
                  //   435: aload_3
                  //   436: ifnull +7 -> 443
                  //   439: aload_3
                  //   440: invokevirtual 132	java/io/LineNumberReader:close	()V
                  //   443: aload 4
                  //   445: athrow
                  //   446: astore_3
                  //   447: ldc 45
                  //   449: ldc -39
                  //   451: iconst_1
                  //   452: anewarray 4	java/lang/Object
                  //   455: dup
                  //   456: iconst_0
                  //   457: aload_3
                  //   458: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
                  //   461: aastore
                  //   462: invokestatic 129	com/tencent/mm/sdk/platformtools/v:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                  //   465: goto -22 -> 443
                  //   468: ldc2_w 36
                  //   471: sipush 3144
                  //   474: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
                  //   477: iconst_1
                  //   478: ireturn
                  //   479: astore 4
                  //   481: goto -46 -> 435
                  //   484: astore 5
                  //   486: aconst_null
                  //   487: astore 4
                  //   489: goto -331 -> 158
                  // Local variable table:
                  //   start	length	slot	name	signature
                  //   0	492	0	this	1
                  //   37	305	1	l	long
                  //   45	329	3	localObject1	Object
                  //   387	12	3	localException1	Exception
                  //   409	12	3	localException2	Exception
                  //   434	6	3	localObject2	Object
                  //   446	12	3	localException3	Exception
                  //   96	284	4	localObject3	Object
                  //   431	13	4	localObject4	Object
                  //   479	1	4	localObject5	Object
                  //   487	1	4	localObject6	Object
                  //   91	13	5	localProcess	Process
                  //   156	16	5	localException4	Exception
                  //   213	162	5	localMap	Map
                  //   484	1	5	localException5	Exception
                  //   125	24	6	str	String
                  // Exception table:
                  //   from	to	target	type
                  //   120	127	156	java/lang/Exception
                  //   135	143	156	java/lang/Exception
                  //   146	153	156	java/lang/Exception
                  //   365	371	156	java/lang/Exception
                  //   374	379	156	java/lang/Exception
                  //   379	384	387	java/lang/Exception
                  //   185	190	409	java/lang/Exception
                  //   83	117	431	finally
                  //   439	443	446	java/lang/Exception
                  //   120	127	479	finally
                  //   135	143	479	finally
                  //   146	153	479	finally
                  //   161	180	479	finally
                  //   365	371	479	finally
                  //   374	379	479	finally
                  //   83	117	484	java/lang/Exception
                }
              }, true).u(10000L, 10000L);
              GMTrace.o(427886116864L, 3188);
            }
          });
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//remittance reset"))
        {
          com.tencent.mm.model.an.yt();
          com.tencent.mm.model.c.uQ().set(327729, "0");
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//wv "))
        {
          localObject1 = paramString.replace("//wv ", "");
          paramString = new Intent();
          paramString.putExtra("rawUrl", (String)localObject1);
          com.tencent.mm.ba.c.b(paramContext, "webview", ".ui.tools.WebViewUI", paramString);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//wvjsapi "))
        {
          localObject1 = paramString.replace("//wvjsapi ", "");
          paramString = new Intent();
          paramString.putExtra("rawUrl", (String)localObject1);
          com.tencent.mm.ba.c.b(paramContext, "webview", ".ui.tools.WebViewTestUI", paramString);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//setibeacontabuinopen"))
        {
          if (com.tencent.mm.model.an.yw())
          {
            com.tencent.mm.model.an.yt();
            com.tencent.mm.model.c.uQ().a(v.a.tBS, Integer.valueOf(1));
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
          }
          bool1 = false;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//setibeacontabuinclose"))
        {
          if (com.tencent.mm.model.an.yw())
          {
            com.tencent.mm.model.an.yt();
            com.tencent.mm.model.c.uQ().a(v.a.tBS, Integer.valueOf(0));
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
          }
          bool1 = false;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//setibeaconpushopen"))
        {
          if (com.tencent.mm.model.an.yw())
          {
            com.tencent.mm.model.an.yt();
            com.tencent.mm.model.c.uQ().a(v.a.tBN, Boolean.valueOf(true));
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
          }
          bool1 = false;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//setibeaconpushclose"))
        {
          if (com.tencent.mm.model.an.yw())
          {
            com.tencent.mm.model.an.yt();
            com.tencent.mm.model.c.uQ().a(v.a.tBN, Boolean.valueOf(false));
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
          }
          bool1 = false;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//ibeacon"))
        {
          bool1 = false;
          bool3 = false;
          if (Build.VERSION.SDK_INT >= 18) {
            bool1 = true;
          }
          paramString = BluetoothAdapter.getDefaultAdapter();
          bool2 = bool3;
          if (paramString != null)
          {
            bool2 = bool3;
            if (paramString.getState() == 12) {
              bool2 = true;
            }
          }
          bool4 = paramContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
          if ((bool1) && (bool2) && (bool4)) {}
          for (bool3 = true;; bool3 = false)
          {
            paramString = "isNowSupportedIbeacon:" + bool3 + "\n\nisSystemSupported:" + bool1 + "\nisBlueStateOn:" + bool2 + "\nisSupportedBLE:" + bool4 + "\nSDK:" + Build.VERSION.SDK_INT + "\nModel:" + Build.BRAND + "-" + com.tencent.mm.compatible.d.p.ru() + "\noperatingSystemInfo:" + com.tencent.mm.compatible.d.p.ry();
            com.tencent.mm.ui.base.g.b(paramContext, paramString, "TestResult", paramContext.getString(R.m.ebA), paramContext.getString(R.m.efp), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(414732779520L, 3090);
                ((ClipboardManager)this.hcG.getSystemService("clipboard")).setText(paramString);
                GMTrace.o(414732779520L, 3090);
              }
            }, null);
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            break;
          }
        }
        if (paramString.startsWith("//settbs"))
        {
          paramContext = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
          paramString = paramString.replace("//settbs", "").trim().split(" ");
          if ((paramString == null) || (paramString.length != 3))
          {
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
          }
          paramContext.putString("tbs_download", paramString[0]);
          paramContext.putString("tbs_enable", paramString[1]);
          paramContext.putString("tbs_supported_ver_sec", paramString[2]);
          paramContext.apply();
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//gettbs"))
        {
          bool1 = com.tencent.mm.compatible.d.p.han.hbh;
          localObject4 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
          localObject1 = ((SharedPreferences)localObject4).getString("tbs_download", null);
          str = ((SharedPreferences)localObject4).getString("tbs_enable", null);
          paramString = ((SharedPreferences)localObject4).getString("tbs_supported_ver_sec", null);
          bool2 = ((SharedPreferences)localObject4).getBoolean("x5_jscore_enabled", false);
          Toast.makeText(paramContext, String.format("forceSys:%b\ntbs_download:%s\ntbs_enable:%s\ntbs_support_ver_sec:%s\ntbsCoreVersion:%d\ntbsSdkVersion:%d\nx5JsCoreEnabled:%b", new Object[] { Boolean.valueOf(bool1), localObject1, str, paramString, Integer.valueOf(WebView.getTbsCoreVersion(paramContext)), Integer.valueOf(WebView.getTbsSDKVersion(paramContext)), Boolean.valueOf(bool2) }), 1).show();
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//deletetbs"))
        {
          paramString = new Intent();
          paramString.setComponent(new ComponentName(com.tencent.mm.sdk.platformtools.aa.getPackageName(), "com.tencent.mm.booter.MMReceivers$SandBoxProcessReceiver"));
          paramContext.sendBroadcast(paramString);
          paramContext = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
          paramContext.putLong("last_check_ts", 0L);
          paramContext.apply();
          com.tencent.mm.model.an.yt();
          com.tencent.mm.model.c.uQ().a(v.a.tCP, Boolean.valueOf(false));
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//tbsDisableOverScroll"))
        {
          localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
          try
          {
            paramContext = paramString.substring(paramString.indexOf(":") + 1);
            ((SharedPreferences.Editor)localObject1).putBoolean("tbs_disable_over_scroll", Boolean.parseBoolean(paramContext));
            ((SharedPreferences.Editor)localObject1).apply();
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
          }
          catch (IndexOutOfBoundsException paramContext)
          {
            for (;;)
            {
              paramContext = "";
            }
          }
        }
        if (paramString.startsWith("//enabletbs"))
        {
          paramContext = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
          paramContext.putString("tbs_enable", paramString.replace("//enabletbs ", ""));
          paramContext.apply();
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//wvsha1"))
        {
          localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
          try
          {
            paramContext = paramString.substring(paramString.indexOf(":") + 1);
            ((SharedPreferences.Editor)localObject1).putBoolean("wvsha1", Boolean.parseBoolean(paramContext));
            ((SharedPreferences.Editor)localObject1).apply();
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
          }
          catch (IndexOutOfBoundsException paramContext)
          {
            for (;;)
            {
              paramContext = "";
            }
          }
        }
        if (paramString.startsWith("//channelId")) {
          com.tencent.mm.ui.base.g.y(paramContext, com.tencent.mm.sdk.platformtools.f.fGL, "channelId");
        }
        if (paramString.startsWith("//traceroute"))
        {
          com.tencent.mm.ba.c.v(paramContext, "traceroute", ".ui.NetworkDiagnoseIntroUI");
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//qzone "))
        {
          localObject1 = paramString.replace("//qzone ", "");
          new com.tencent.mm.pluginsdk.ui.applet.k(paramContext).Kl((String)localObject1);
        }
        if (paramString.startsWith("//dumpcrash"))
        {
          j.o(com.tencent.mm.compatible.util.e.hnt + "crash/", com.tencent.mm.compatible.util.e.hny, false);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//dumpanr"))
        {
          j.o("/data/anr/", com.tencent.mm.compatible.util.e.hny, false);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//testanr")) {
          try
          {
            Thread.sleep(10000L);
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
          }
          catch (InterruptedException paramContext)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
            }
          }
        }
        if (paramString.startsWith("//opensnsadRightbar"))
        {
          com.tencent.mm.platformtools.r.iuu = true;
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//setlocation "))
        {
          paramContext = paramString.split(" ");
          if ((paramContext != null) && (com.tencent.mm.sdk.a.b.bAT()))
          {
            com.tencent.mm.platformtools.r.itK = true;
            if (paramContext.length > 0) {
              com.tencent.mm.platformtools.r.lat = bf.getDouble(paramContext[1], 0.0D);
            }
            if (paramContext.length > 1) {
              com.tencent.mm.platformtools.r.lng = bf.getDouble(paramContext[2], 0.0D);
            }
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
          }
          bool1 = false;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//switchsdcard"))
        {
          paramString = au.bCc();
          j = paramString.size();
          com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "switchsdcard sdcard size = " + j);
          if ((j > 0) && (paramString.get(0) != null) && (!bf.ld(((au.a)paramString.get(0)).tvp))) {
            for (i = 0; i < j; i++) {
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "switchsdcard list i = " + i + " StatMountParse: " + paramString.get(i));
            }
          }
          for (i = 0;; i++)
          {
            if (i >= j) {
              break label15459;
            }
            if (!((au.a)paramString.get(i)).tvp.equals(com.tencent.mm.compatible.util.e.hnv))
            {
              paramString = ((au.a)paramString.get(i)).tvp;
              localObject1 = (Activity)paramContext;
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "switchsdcard newSdcard: " + paramString);
              if (!bf.ld(paramString)) {
                break label6102;
              }
              com.tencent.mm.ui.base.g.bc(paramContext, paramContext.getString(R.m.fkm));
              bool1 = true;
              GMTrace.o(424262238208L, 3161);
              break;
            }
          }
          label6102:
          com.tencent.mm.ui.base.g.b(paramContext, paramContext.getString(R.m.fkn), "", paramContext.getString(R.m.dQz), paramContext.getString(R.m.dOX), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(415001214976L, 3092);
              paramAnonymousDialogInterface = new s(com.tencent.mm.storage.v.hnt + "SdcardInfo.cfg");
              paramAnonymousDialogInterface.set(1, this.hcX);
              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "switchsdcard reset to sdcard root: " + paramAnonymousDialogInterface.get(1));
              com.tencent.mm.sdk.platformtools.ac.MM("welcome_page_show");
              com.tencent.mm.kernel.i.d(paramContext, true);
              paramAnonymousDialogInterface = new com.tencent.mm.e.a.aa();
              paramAnonymousDialogInterface.fOL.fOM = false;
              com.tencent.mm.sdk.b.a.trT.y(paramAnonymousDialogInterface);
              WorkerProfile.ou().fJf.op();
              com.tencent.mm.model.an.getNotification().pY();
              paramAnonymousDialogInterface = new Intent();
              paramAnonymousDialogInterface.setComponent(new ComponentName(d.g.tLY, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
              paramAnonymousDialogInterface.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
              com.tencent.mm.sdk.platformtools.aa.getContext().sendBroadcast(paramAnonymousDialogInterface);
              if (m.a.rDR != null) {
                m.a.rDR.ai(localObject1);
              }
              localObject1.finish();
              GMTrace.o(415001214976L, 3092);
            }
          }, null);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//getip"))
        {
          com.tencent.mm.model.an.uC().d(new bd(new bd.a()
          {
            public final void a(com.tencent.mm.network.e paramAnonymouse)
            {
              GMTrace.i(420638359552L, 3134);
              if (paramAnonymouse == null) {
                GMTrace.o(420638359552L, 3134);
              }
              for (;;)
              {
                return;
                String[] arrayOfString = paramAnonymouse.getIPsString(true);
                for (int i = 0; i < arrayOfString.length; i++)
                {
                  com.tencent.mm.sdk.platformtools.v.d("MicroMsg.CommandProcessor", "dkip long:%d  %s", new Object[] { Integer.valueOf(i), arrayOfString[i] });
                  com.tencent.mm.sdk.platformtools.v.d("MicroMsg.CommandProcessor", "dkip long:%d %s", new Object[] { Integer.valueOf(i), com.tencent.mm.network.a.c.md(arrayOfString[i]).toString() });
                }
                paramAnonymouse = paramAnonymouse.getIPsString(false);
                for (i = 0; i < paramAnonymouse.length; i++)
                {
                  com.tencent.mm.sdk.platformtools.v.d("MicroMsg.CommandProcessor", "dkip short:%d %s", new Object[] { Integer.valueOf(i), paramAnonymouse[i] });
                  com.tencent.mm.sdk.platformtools.v.d("MicroMsg.CommandProcessor", "dkip long:%d %s", new Object[] { Integer.valueOf(i), com.tencent.mm.network.a.c.md(paramAnonymouse[i]).toString() });
                }
                GMTrace.o(420638359552L, 3134);
              }
            }
          }));
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//localjsapi"))
        {
          localObject1 = "file://" + com.tencent.mm.compatible.util.e.hnx + "test_jsapi.html";
          paramString = new Intent();
          paramString.putExtra("rawUrl", (String)localObject1);
          com.tencent.mm.ba.c.b(paramContext, "webview", ".ui.tools.WebViewUI", paramString);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//getlocalkey"))
        {
          paramString = com.tencent.mm.storage.bb.bFo();
          com.tencent.mm.ui.base.g.b(paramContext, paramString, "Fingerprint Key", paramContext.getString(R.m.foO), paramContext.getString(R.m.efp), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(423859585024L, 3158);
              ((ClipboardManager)this.hcG.getSystemService("clipboard")).setText(paramString);
              Toast.makeText(this.hcG, R.m.foP, 0).show();
              GMTrace.o(423859585024L, 3158);
            }
          }, null);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//getdevid"))
        {
          paramString = com.tencent.mm.compatible.d.p.rq();
          com.tencent.mm.ui.base.g.b(paramContext, paramString, "devid", paramContext.getString(R.m.ebA), paramContext.getString(R.m.efp), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(425335980032L, 3169);
              ((ClipboardManager)this.hcG.getSystemService("clipboard")).setText(paramString);
              GMTrace.o(425335980032L, 3169);
            }
          }, null);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//testhtml"))
        {
          paramString = new Intent();
          paramString.putExtra("rawUrl", "file:///android_asset/jsapi/reader_test1.html");
          com.tencent.mm.ba.c.b(paramContext, "webview", ".ui.tools.WebViewUI", paramString);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//testlocalhtml "))
        {
          paramString = paramString.replace("//testlocalhtml ", "");
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("rawUrl", "file://" + paramString);
          ((Intent)localObject1).putExtra("neverGetA8Key", true);
          com.tencent.mm.ba.c.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//setkey"))
        {
          if (com.tencent.mm.storage.bb.Ps(paramString.replace("//setkey", ""))) {
            Toast.makeText(paramContext, R.m.foh, 0).show();
          }
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//checkspell"))
        {
          localObject1 = paramString.replace("//checkspell ", "");
          if (bf.ld((String)localObject1))
          {
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
          }
          paramString = new StringBuilder();
          for (i = 0; i < ((String)localObject1).length(); i++) {
            paramString.append("[" + ((String)localObject1).charAt(i) + ":" + SpellMap.f(((String)localObject1).charAt(i)) + "]");
          }
          com.tencent.mm.ui.base.g.y(paramContext, paramString.toString(), "Check Spell");
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//gallery "))
        {
          paramString = paramString.replace("//gallery ", "");
          if (bf.ld(paramString))
          {
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
          }
          paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.aa.bBv(), 0).edit().putString("gallery", paramString).commit();
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
          continue;
        }
        if (paramString.startsWith("//svgtag"))
        {
          paramContext = paramString.replace("//svgtag ", "");
          if (paramContext.equals("on")) {
            com.tencent.mm.bg.c.jc(true);
          }
          for (;;)
          {
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            break;
            if (paramContext.equals("off")) {
              com.tencent.mm.bg.c.jc(false);
            }
          }
        }
        if (paramString.startsWith("//svgcode")) {}
        try
        {
          paramContext = paramString.replace("//svgcode ", "");
          if (!paramContext.equals("on")) {
            paramContext.equals("off");
          }
          paramString = Class.forName("com.tencent.mm.BuildConfig");
          paramContext = paramString.getDeclaredField("SVGCode");
          paramContext.setAccessible(true);
          bool1 = paramContext.getBoolean(paramString);
          paramString = com.tencent.mm.sdk.platformtools.aa.getContext();
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>("Using SVG Code : ");
          Toast.makeText(paramString, bool1 + " " + com.tencent.mm.svg.b.b.bGn(), 1).show();
          bool1 = true;
          GMTrace.o(424262238208L, 3161);
        }
        catch (ClassNotFoundException paramContext)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
            bool1 = false;
          }
        }
        catch (NoSuchFieldException paramContext)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
            bool1 = false;
          }
        }
        catch (IllegalAccessException paramContext)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
            bool1 = false;
          }
        }
        catch (IllegalArgumentException paramContext)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
            bool1 = false;
          }
          if (paramString.startsWith("//testMbanner")) {}
          try
          {
            paramString = paramString.replace("//testMbanner ", "").split(",");
            if (paramString.length >= 2)
            {
              localObject1 = ba.yE();
              paramContext = new com/tencent/mm/model/az;
              paramContext.<init>(Integer.valueOf(paramString[0]).intValue(), Integer.valueOf(paramString[1]).intValue(), null);
              ((ba)localObject1).a(paramContext);
            }
            bool1 = true;
            GMTrace.o(424262238208L, 3161);
            continue;
            if (paramString.startsWith("//testrsa")) {
              com.tencent.mm.protocal.ac.F("010001", "E338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
            }
            if (paramString.startsWith("//recomT")) {}
            try
            {
              paramContext = paramString.replace("//recomT ", "");
              com.tencent.mm.model.an.yt().wR().a(paramContext, true, null);
              bool1 = true;
              GMTrace.o(424262238208L, 3161);
              continue;
              if (paramString.startsWith("//recomF")) {}
              try
              {
                paramContext = paramString.replace("//recomF ", "");
                com.tencent.mm.model.an.yt().wR().a(paramContext, false, null);
                bool1 = true;
                GMTrace.o(424262238208L, 3161);
                continue;
                if (paramString.startsWith("//testgetreg")) {}
                try
                {
                  paramString = paramString.replace("//testgetreg ", "").split(",");
                  if (paramString.length > 2)
                  {
                    paramContext = new com/tencent/mm/model/bj$a;
                    paramContext.<init>();
                    paramContext.fc(Integer.valueOf(paramString[0]).intValue()).fe(Integer.valueOf(paramString[1]).intValue()).fd(Integer.valueOf(paramString[2]).intValue()).commit();
                  }
                  bool1 = true;
                  GMTrace.o(424262238208L, 3161);
                  continue;
                  if (paramString.startsWith("//ffmpeg")) {
                    try
                    {
                      i = paramString.indexOf("-r ");
                      j = paramString.indexOf("-b ");
                      paramContext = paramString.substring(i + 3, j);
                      paramString = paramString.substring(j + 3);
                      float f = bf.getFloat(paramContext.trim(), 0.0F);
                      i = bf.getInt(paramString.trim(), 0);
                      com.tencent.mm.plugin.sight.base.b.oPL = i;
                      com.tencent.mm.plugin.sight.base.b.oPM = f;
                      paramString = com.tencent.mm.sdk.platformtools.aa.getContext();
                      paramContext = new java/lang/StringBuilder;
                      paramContext.<init>("set C2C video encode frame rate ");
                      Toast.makeText(paramString, f + " bitrate " + i, 0).show();
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                    }
                    catch (Exception paramContext)
                    {
                      for (;;)
                      {
                        Toast.makeText(com.tencent.mm.sdk.platformtools.aa.getContext(), "set C2C video frame rate fail, please ensure your command.", 1).show();
                      }
                    }
                  }
                  if (paramString.startsWith("//onlinevideo")) {
                    for (;;)
                    {
                      try
                      {
                        i = bf.getInt(paramString.replace("//onlinevideo ", ""), 0);
                        com.tencent.mm.model.an.yt();
                        com.tencent.mm.model.c.uQ().a(v.a.tDR, Integer.valueOf(i));
                        if (i <= 0) {
                          continue;
                        }
                        paramContext = "online video";
                        Toast.makeText(com.tencent.mm.sdk.platformtools.aa.getContext(), paramContext, 0).show();
                      }
                      catch (Exception paramContext)
                      {
                        com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                        Toast.makeText(com.tencent.mm.sdk.platformtools.aa.getContext(), "set online video fail, please ensure your command.", 1).show();
                        continue;
                      }
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                      break;
                      paramContext = "offline video";
                    }
                  }
                  if (paramString.startsWith("//hevcinfo"))
                  {
                    localObject1 = com.tencent.mm.plugin.m.e.aEh();
                    paramContext = En_5b8fbb1e.a.uEw;
                    paramString = new av();
                    paramString.cG(paramContext);
                    paramString.dq(2);
                    paramString.setType(1);
                    paramString.z(System.currentTimeMillis());
                    paramString.setContent((String)localObject1);
                    com.tencent.mm.model.bb.g(paramString);
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//calcwxdata"))
                  {
                    com.tencent.mm.model.an.yt();
                    com.tencent.mm.model.c.uQ().a(v.a.tGe, Long.valueOf(0L));
                    Toast.makeText(com.tencent.mm.sdk.platformtools.aa.getContext(), "calc wx data success", 0).show();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//upfacemodel"))
                  {
                    com.tencent.mm.model.an.uC().d(new com.tencent.mm.pluginsdk.l.a.a.m(42));
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//facett"))
                  {
                    com.tencent.mm.model.an.yt();
                    com.tencent.mm.model.c.uQ().a(v.a.tFr, Boolean.valueOf(false));
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//switchpaytype"))
                  {
                    paramContext = paramString.split(" ");
                    if ((paramContext != null) && (paramContext.length >= 2))
                    {
                      try
                      {
                        i = bf.getInt(paramContext[1], 0);
                        com.tencent.mm.model.an.yt();
                        com.tencent.mm.model.c.uQ().set(339975, Integer.valueOf(i));
                        bool1 = true;
                        GMTrace.o(424262238208L, 3161);
                      }
                      catch (Exception paramContext)
                      {
                        com.tencent.mm.sdk.platformtools.v.e("MicroMsg.CommandProcessor", "hy: switch wallet type error");
                        bool1 = false;
                        GMTrace.o(424262238208L, 3161);
                      }
                      continue;
                    }
                    bool1 = false;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//setNfcOpenUrl "))
                  {
                    paramContext = paramString.replace("//setNfcOpenUrl ", "");
                    paramString = com.tencent.mm.sdk.platformtools.aa.bBy().edit();
                    paramString.putString("nfc_open_url", paramContext);
                    paramString.commit();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//snskvtest "))
                  {
                    paramContext = paramString.replace("//snskvtest", "").trim();
                    if (paramContext.equals("0")) {
                      com.tencent.mm.platformtools.r.iuQ = false;
                    }
                    for (;;)
                    {
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                      break;
                      if (paramContext.equals("1")) {
                        com.tencent.mm.platformtools.r.iuQ = true;
                      }
                    }
                  }
                  if (paramString.startsWith("//emoji "))
                  {
                    paramContext = paramString.replace("//emoji ", "");
                    m.a.buD().sq(paramContext);
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//share "))
                  {
                    i = Integer.valueOf(paramString.replace("//share ", "")).intValue();
                    com.tencent.mm.model.an.yt();
                    com.tencent.mm.model.c.uQ().set(229635, Integer.valueOf(i));
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//dumpappinfoblob "))
                  {
                    paramString = paramString.replace("//dumpappinfoblob ", "");
                    paramString = com.tencent.mm.pluginsdk.model.app.am.bvM().Jn(paramString);
                    com.tencent.mm.ui.base.g.y(paramContext, paramString.pq() + "\n" + paramString.pr() + "\n" + paramString.ps(), "");
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//googleauth "))
                  {
                    paramString = paramString.replace("//googleauth ", "");
                    if (!TextUtils.isEmpty(paramString))
                    {
                      if (!"webview".equals(paramString)) {
                        break label8387;
                      }
                      paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.aa.bBv(), 0).edit().putBoolean("googleauth", true).commit();
                    }
                    for (;;)
                    {
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                      break;
                      if ("local".equals(paramString)) {
                        paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.aa.bBv(), 0).edit().putBoolean("googleauth", false).commit();
                      }
                    }
                  }
                  if (paramString.startsWith("//clrgamecache"))
                  {
                    paramString = m.a.buE();
                    if (paramString != null) {
                      paramString.cg(paramContext);
                    }
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//googlemap"))
                  {
                    com.tencent.mm.platformtools.r.iut = true;
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//sosomap"))
                  {
                    com.tencent.mm.platformtools.r.iut = false;
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//opentrace"))
                  {
                    new com.tencent.mm.ui.applet.d();
                    com.tencent.mm.ui.applet.d.eD(com.tencent.mm.sdk.platformtools.aa.getContext());
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//updateConversation"))
                  {
                    com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "update all conversation start");
                    com.tencent.mm.model.an.yt();
                    paramContext = com.tencent.mm.model.c.wo().bDY().iterator();
                    while (paramContext.hasNext())
                    {
                      paramString = (String)paramContext.next();
                      com.tencent.mm.model.an.yt();
                      paramString = com.tencent.mm.model.c.wl().cl(paramString, " and not ( type = 10000 and isSend != 2 ) ");
                      com.tencent.mm.model.an.yt();
                      com.tencent.mm.model.c.wo().W(paramString);
                    }
                    com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "update all conversation end");
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//setshakecarddata"))
                  {
                    m.a.buC().aUb();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//clearshakecarddata"))
                  {
                    m.a.buC().aUc();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//pageSize"))
                  {
                    paramContext = com.tencent.mm.sdk.platformtools.aa.getContext();
                    paramString = new StringBuilder("pageSize is ");
                    com.tencent.mm.model.an.yt();
                    Toast.makeText(paramContext, com.tencent.mm.model.c.wg().getPageSize(), 1).show();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//resetDBStatus"))
                  {
                    com.tencent.mm.model.an.yt();
                    paramContext = new File(com.tencent.mm.model.c.uO());
                    try
                    {
                      paramString = new java/lang/StringBuilder;
                      paramString.<init>();
                      com.tencent.mm.model.an.yt();
                      paramString = com.tencent.mm.model.c.wN() + paramContext.getName().replace(".db", ".db.backup");
                      localObject1 = new java/io/File;
                      ((File)localObject1).<init>(paramString);
                      com.tencent.mm.ui.tools.e.d((File)localObject1, paramContext);
                      com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "backupPath db path is %s", new Object[] { paramString });
                      paramString = new java/lang/StringBuilder;
                      paramString.<init>();
                      paramString = paramContext.getAbsolutePath() + "err" + System.currentTimeMillis();
                      localObject1 = new java/io/File;
                      ((File)localObject1).<init>(paramString);
                      com.tencent.mm.a.e.a(paramContext, (File)localObject1);
                      Toast.makeText(com.tencent.mm.sdk.platformtools.aa.getContext(), "db����������,����������", 1).show();
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                    }
                    catch (Exception paramContext)
                    {
                      for (;;)
                      {
                        com.tencent.mm.sdk.platformtools.v.w("MicroMsg.CommandProcessor", "delete failed: " + paramContext.getMessage());
                      }
                    }
                  }
                  if (paramString.startsWith("//makesnsdata "))
                  {
                    i = bf.getInt(paramString.replace("//makesnsdata ", ""), 0);
                    m.aj.buN().di(i);
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//setsnsupload "))
                  {
                    com.tencent.mm.platformtools.r.iuD = bf.getInt(paramString.replace("//setsnsupload ", ""), 0);
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//logsnstable"))
                  {
                    paramContext = new cd();
                    com.tencent.mm.sdk.b.a.trT.y(paramContext);
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//fpsreset "))
                  {
                    paramContext = new ff();
                    if (paramString.equalsIgnoreCase("//fpsreset on")) {}
                    for (paramContext.fVm.fQi = 1;; paramContext.fVm.fQi = 0)
                    {
                      com.tencent.mm.sdk.b.a.trT.y(paramContext);
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                      break;
                    }
                  }
                  if (paramString.startsWith("//resetsnstip"))
                  {
                    com.tencent.mm.model.an.yt();
                    com.tencent.mm.model.c.uQ().set(327776, Integer.valueOf(0));
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//checkcount"))
                  {
                    com.tencent.mm.model.an.yt();
                    j = com.tencent.mm.model.c.wl().xU(En_5b8fbb1e.a.uEw);
                    com.tencent.mm.model.an.yt();
                    i = com.tencent.mm.model.c.wl().xS(En_5b8fbb1e.a.uEw);
                    Toast.makeText(paramContext, "current count :" + j + " countAuto :" + i, 1).show();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//changeframe "))
                  {
                    paramContext = paramString.replace("//changeframe ", "");
                    com.tencent.mm.sdk.platformtools.aa.getContext().getSharedPreferences("preferences_animation", 0).edit().putFloat("frameInterval", Float.valueOf(paramContext).floatValue()).commit();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//opendumpview"))
                  {
                    new com.tencent.mm.ui.applet.c();
                    com.tencent.mm.ui.applet.c.eC(com.tencent.mm.sdk.platformtools.aa.getContext());
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//dumpmemory"))
                  {
                    System.gc();
                    System.gc();
                    com.tencent.mm.bj.b.bGs();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//dumpsnsfile"))
                  {
                    paramContext = new ol();
                    com.tencent.mm.sdk.b.a.trT.y(paramContext);
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//coverage"))
                  {
                    com.tencent.mm.plugin.report.c.f.AI(paramString.trim().substring(10));
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//dumpthreadpool"))
                  {
                    com.tencent.mm.sdk.e.e.bCP();
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//testverifypsw "))
                  {
                    paramContext = paramString.replace("//testverifypsw ", "").trim();
                    if (paramContext.equals("0")) {
                      com.tencent.mm.platformtools.r.iuS = false;
                    }
                    for (;;)
                    {
                      com.tencent.mm.sdk.platformtools.v.d("MicroMsg.CommandProcessor", "summerdktext testverifypsw msg[%s], testVerifyPsw[%b]", new Object[] { paramString, Boolean.valueOf(com.tencent.mm.platformtools.r.iuS) });
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                      break;
                      if (paramContext.equals("1")) {
                        com.tencent.mm.platformtools.r.iuS = true;
                      }
                    }
                  }
                  if (paramString.startsWith("//pickpoi"))
                  {
                    paramString = new Intent();
                    paramString.putExtra("map_view_type", 8);
                    com.tencent.mm.ba.c.b(paramContext, "location", ".ui.RedirectUI", paramString);
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                  }
                  if (paramString.startsWith("//configlist"))
                  {
                    if (paramString.matches("^//configlist set ([\\S]*)=([\\S]*)$"))
                    {
                      paramString = com.tencent.mm.platformtools.u.ar(paramString, "^//configlist set ([\\S]*)=([\\S]*)$");
                      if ((paramString != null) && (paramString.size() == 2))
                      {
                        paramContext = (String)paramString.get(0);
                        paramString = (String)paramString.get(1);
                        com.tencent.mm.i.g.sN().put(paramContext, paramString);
                        paramContext = new ce();
                        com.tencent.mm.sdk.b.a.trT.y(paramContext);
                      }
                    }
                    for (;;)
                    {
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                      break;
                      if (paramString.matches("^//configlist get ([\\S]*)$"))
                      {
                        paramString = com.tencent.mm.platformtools.u.ar(paramString, "^//configlist get ([\\S]*)$");
                        if ((paramString != null) && (paramString.size() == 1))
                        {
                          paramString = (String)paramString.get(0);
                          localObject1 = com.tencent.mm.i.g.sN().getValue(paramString);
                          Toast.makeText(paramContext, paramString + "=" + (String)localObject1, 0).show();
                        }
                      }
                      else
                      {
                        com.tencent.mm.model.an.yt();
                        localObject1 = (String)com.tencent.mm.model.c.uQ().get(278530, "");
                        com.tencent.mm.model.an.yt();
                        paramString = (String)com.tencent.mm.model.c.uQ().get(278529, "");
                        localObject4 = com.tencent.mm.compatible.util.e.hnx + "dynacfg.xml";
                        bf.q((String)localObject4, ((String)localObject1 + paramString).getBytes());
                        Toast.makeText(paramContext, "output dynacfg xml to " + (String)localObject4, 0).show();
                      }
                    }
                  }
                  if (paramString.startsWith("//security")) {}
                  try
                  {
                    paramContext = paramString.replace("//security ", "");
                    com.tencent.mm.model.an.yt().wS().a(paramContext, true, null);
                    bool1 = true;
                    GMTrace.o(424262238208L, 3161);
                    continue;
                    if (paramString.startsWith("//updatepackage")) {}
                    try
                    {
                      paramContext = paramString.replace("//updatepackage ", "");
                      paramString = new com/tencent/mm/am/k;
                      paramString.<init>(bf.getInt(paramContext.trim(), 0));
                      com.tencent.mm.model.an.uC().d(paramString);
                      bool1 = true;
                      GMTrace.o(424262238208L, 3161);
                      continue;
                      if (paramString.startsWith("//copypackage"))
                      {
                        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercmd copypackage msg:%s", new Object[] { paramString });
                        paramString = au.bCc();
                        i = paramString.size();
                        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d", new Object[] { Integer.valueOf(i) });
                        if (i < 2) {
                          com.tencent.mm.ui.base.g.bc(paramContext, paramContext.getString(R.m.eiW));
                        }
                        for (;;)
                        {
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                          com.tencent.mm.ui.base.g.b(paramContext, paramContext.getString(R.m.eiY), "", paramContext.getString(R.m.dQz), paramContext.getString(R.m.dOX), new DialogInterface.OnClickListener()
                          {
                            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                            {
                              GMTrace.i(415269650432L, 3094);
                              com.tencent.mm.sdk.e.e.post(new Runnable()
                              {
                                public final void run()
                                {
                                  GMTrace.i(420101488640L, 3130);
                                  for (;;)
                                  {
                                    try
                                    {
                                      String str1 = com.tencent.mm.compatible.util.e.hnv;
                                      com.tencent.mm.model.an.yt();
                                      localObject2 = com.tencent.mm.model.c.wD();
                                      com.tencent.mm.model.an.yt();
                                      String str2 = com.tencent.mm.model.c.wc();
                                      localObject1 = ((String)localObject2).substring(str1.length());
                                      com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d, root:%s, pkgFullPath:%s, sysPath:%s, pkgPath:%s", new Object[] { Integer.valueOf(b.4.this.hcJ), str1, localObject2, str2, localObject1 });
                                      i = 0;
                                      if (i >= b.4.this.hcJ) {
                                        continue;
                                      }
                                      str2 = ((au.a)b.4.this.hcK.get(i)).tvp;
                                      if ((!bf.ld(str2)) && (!str1.contains(str2)))
                                      {
                                        File localFile = new java/io/File;
                                        StringBuilder localStringBuilder = new java/lang/StringBuilder;
                                        localStringBuilder.<init>();
                                        localFile.<init>(str2 + (String)localObject1);
                                        if ((localFile.exists()) && (localFile.isDirectory()))
                                        {
                                          boolean bool = j.o(localFile.getAbsolutePath(), (String)localObject2, false);
                                          com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercmd copypackage done pkgFullPath:%s, old:%s, ret:%b", new Object[] { localObject2, localFile.getAbsolutePath(), Boolean.valueOf(bool) });
                                          if (bool)
                                          {
                                            localObject1 = new com/tencent/mm/sdk/platformtools/ad;
                                            ((com.tencent.mm.sdk.platformtools.ad)localObject1).<init>(Looper.getMainLooper());
                                            localObject2 = new com/tencent/mm/console/b$4$1$1;
                                            ((1)localObject2).<init>(this);
                                            ((com.tencent.mm.sdk.platformtools.ad)localObject1).post((Runnable)localObject2);
                                            GMTrace.o(420101488640L, 3130);
                                            return;
                                          }
                                        }
                                      }
                                    }
                                    catch (Exception localException)
                                    {
                                      Object localObject2;
                                      Object localObject1;
                                      int i;
                                      com.tencent.mm.sdk.platformtools.v.w("MicroMsg.CommandProcessor", "summercmd copypackage e:%s", new Object[] { localException.getMessage() });
                                      GMTrace.o(420101488640L, 3130);
                                      continue;
                                    }
                                    i++;
                                    continue;
                                    localObject1 = new com/tencent/mm/sdk/platformtools/ad;
                                    ((com.tencent.mm.sdk.platformtools.ad)localObject1).<init>(Looper.getMainLooper());
                                    localObject2 = new com/tencent/mm/console/b$4$1$2;
                                    ((2)localObject2).<init>(this);
                                    ((com.tencent.mm.sdk.platformtools.ad)localObject1).post((Runnable)localObject2);
                                    GMTrace.o(420101488640L, 3130);
                                  }
                                }
                              }, "copypackage");
                              GMTrace.o(415269650432L, 3094);
                            }
                          }, null);
                        }
                      }
                      if (paramString.startsWith("//copy -n "))
                      {
                        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercmd copy -n msg:%s ", new Object[] { paramString });
                        localObject1 = au.bCc();
                        i = ((ArrayList)localObject1).size();
                        com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercmd copy -n size:%d", new Object[] { Integer.valueOf(i) });
                        if (i < 2) {
                          com.tencent.mm.ui.base.g.bc(paramContext, paramContext.getString(R.m.eiW));
                        }
                        for (;;)
                        {
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                          com.tencent.mm.ui.base.g.b(paramContext, paramContext.getString(R.m.eiY), "", paramContext.getString(R.m.dQz), paramContext.getString(R.m.dOX), new DialogInterface.OnClickListener()
                          {
                            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                            {
                              GMTrace.i(427080810496L, 3182);
                              com.tencent.mm.sdk.e.e.post(new Runnable()
                              {
                                public final void run()
                                {
                                  GMTrace.i(427349245952L, 3184);
                                  for (;;)
                                  {
                                    try
                                    {
                                      Object localObject4 = b.5.this.hcN.substring(10);
                                      localObject1 = com.tencent.mm.compatible.util.e.hnv;
                                      com.tencent.mm.model.an.yt();
                                      Object localObject3 = com.tencent.mm.model.c.wO();
                                      localObject2 = new java/lang/StringBuilder;
                                      ((StringBuilder)localObject2).<init>();
                                      String str = (String)localObject3 + (String)localObject4;
                                      localObject2 = str.substring(((String)localObject1).length());
                                      com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercmd copy -n subDir:%s, root:%s, accPath:%s destPath:%s, subPath:%s", new Object[] { localObject4, localObject1, localObject3, str, localObject2 });
                                      i = 0;
                                      if (i >= b.5.this.hcJ) {
                                        continue;
                                      }
                                      localObject4 = ((au.a)b.5.this.hcK.get(i)).tvp;
                                      if ((!bf.ld((String)localObject4)) && (!((String)localObject1).contains((CharSequence)localObject4)))
                                      {
                                        localObject3 = new java/io/File;
                                        StringBuilder localStringBuilder = new java/lang/StringBuilder;
                                        localStringBuilder.<init>();
                                        ((File)localObject3).<init>((String)localObject4 + (String)localObject2);
                                        if ((((File)localObject3).exists()) && (((File)localObject3).isDirectory()))
                                        {
                                          localObject4 = new java/io/File;
                                          ((File)localObject4).<init>(str);
                                          if (!((File)localObject4).exists()) {
                                            ((File)localObject4).mkdir();
                                          }
                                          boolean bool = j.o(((File)localObject3).getAbsolutePath(), ((File)localObject4).getAbsolutePath(), false);
                                          com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercmd copy -n done new:%s, old:%s, ret:%b", new Object[] { ((File)localObject4).getAbsolutePath(), ((File)localObject3).getAbsolutePath(), Boolean.valueOf(bool) });
                                          if (bool)
                                          {
                                            localObject1 = new com/tencent/mm/sdk/platformtools/ad;
                                            ((com.tencent.mm.sdk.platformtools.ad)localObject1).<init>(Looper.getMainLooper());
                                            localObject2 = new com/tencent/mm/console/b$5$1$1;
                                            ((1)localObject2).<init>(this);
                                            ((com.tencent.mm.sdk.platformtools.ad)localObject1).post((Runnable)localObject2);
                                            GMTrace.o(427349245952L, 3184);
                                            return;
                                          }
                                        }
                                      }
                                    }
                                    catch (Exception localException)
                                    {
                                      Object localObject1;
                                      Object localObject2;
                                      int i;
                                      com.tencent.mm.sdk.platformtools.v.w("MicroMsg.CommandProcessor", "summercmd copy -n e:%s", new Object[] { localException.getMessage() });
                                      GMTrace.o(427349245952L, 3184);
                                      continue;
                                    }
                                    i++;
                                    continue;
                                    localObject2 = new com/tencent/mm/sdk/platformtools/ad;
                                    ((com.tencent.mm.sdk.platformtools.ad)localObject2).<init>(Looper.getMainLooper());
                                    localObject1 = new com/tencent/mm/console/b$5$1$2;
                                    ((2)localObject1).<init>(this);
                                    ((com.tencent.mm.sdk.platformtools.ad)localObject2).post((Runnable)localObject1);
                                    GMTrace.o(427349245952L, 3184);
                                  }
                                }
                              }, "copy -n");
                              GMTrace.o(427080810496L, 3182);
                            }
                          }, null);
                        }
                      }
                      if (paramString.startsWith("//deletepackage")) {}
                      try
                      {
                        paramString = paramString.replace("//deletepackage ", "");
                        paramContext = new com/tencent/mm/e/a/by;
                        paramContext.<init>();
                        paramContext.fQU.fQV = bf.getInt(paramString, 0);
                        com.tencent.mm.sdk.b.a.trT.y(paramContext);
                        bool1 = true;
                        GMTrace.o(424262238208L, 3161);
                        continue;
                        if (paramString.startsWith("//audiowritetofile"))
                        {
                          com.tencent.mm.compatible.d.p.hal.gXA = true;
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//bankcard"))
                        {
                          paramString = new Intent();
                          paramString.putExtra("BaseScanUI_select_scan_mode", 7);
                          paramString.putExtra("bank_card_owner", "test");
                          if ((!com.tencent.mm.au.u.bi(paramContext)) && (!com.tencent.mm.ai.a.aU(paramContext))) {
                            com.tencent.mm.ba.c.b((Activity)paramContext, "scanner", ".ui.BaseScanUI", paramString);
                          }
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//banner"))
                        {
                          localObject1 = bg.q("<sysmsg type=\"banner\"><mainframebanner type=\"11\"><showtype>1</showtype></mainframebanner></sysmsg>", "sysmsg");
                          com.tencent.mm.sdk.platformtools.v.d("MicroMsg.CommandProcessor", "type:%s showType:%s data:%s", new Object[] { (String)((Map)localObject1).get(".sysmsg.mainframebanner.$type"), (String)((Map)localObject1).get(".sysmsg.mainframebanner.showtype"), (String)((Map)localObject1).get(".sysmsg.mainframebanner.data") });
                        }
                        if (paramString.startsWith("//gamemsg"))
                        {
                          paramContext = new le();
                          paramContext.gdm.content = paramString;
                          com.tencent.mm.sdk.b.a.trT.y(paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//shortcut#"))
                        {
                          com.tencent.mm.plugin.q.c.oPD = paramString.substring(11);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//gallerytype"))
                        {
                          if (!com.tencent.mm.ui.chatting.ac.uxX) {}
                          for (bool1 = true;; bool1 = false)
                          {
                            com.tencent.mm.ui.chatting.ac.uxX = bool1;
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                          }
                        }
                        paramContext.getString(R.m.fpH);
                        if (paramString.startsWith("//fullexit"))
                        {
                          com.tencent.mm.sdk.platformtools.ac.MM("show_whatsnew");
                          com.tencent.mm.kernel.i.d(paramContext, true);
                          MMAppMgr.ai(paramContext);
                          com.tencent.mm.model.an.hold();
                          com.tencent.mm.kernel.h.vh().dX("");
                          MMAppMgr.bIu();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//cleardldb"))
                        {
                          com.tencent.mm.model.an.yt().wp().bEm();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//setcardlayouttestdata"))
                        {
                          paramContext = paramString.replace("//setcardlayouttestdata ", "");
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.uQ().a(v.a.tzU, paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//voicetrymore"))
                        {
                          i = 1;
                          if (paramString.length() > 14) {
                            i = bf.getInt(paramString.substring(14), 1);
                          }
                          if (i == 1) {}
                          for (bool1 = true;; bool1 = false)
                          {
                            com.tencent.mm.c.b.i.hsf = bool1;
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                          }
                        }
                        if (paramString.startsWith("//delchatroomsysmsg"))
                        {
                          paramString = paramString.replace("//delchatroomsysmsg ", "");
                          i = paramString.indexOf(" ");
                          paramContext = paramString.substring(0, i);
                          localObject1 = paramString.substring(i);
                          if (bf.ld(paramContext))
                          {
                            bool1 = false;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                          if (((String)localObject1).startsWith("<"))
                          {
                            paramString = new av();
                            paramString.z(System.currentTimeMillis());
                            paramString.setType(10002);
                            paramString.setContent((String)localObject1);
                            paramString.dq(0);
                            paramString.cG(paramContext);
                            com.tencent.mm.model.bb.g(paramString);
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                          bool1 = false;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        long l3;
                        if (paramString.startsWith("//resetcrseq"))
                        {
                          localObject1 = paramString.split(" ");
                          try
                          {
                            l1 = bf.getLong(localObject1[1], -1L);
                            l2 = bf.getLong(localObject1[2], -1L);
                            l3 = bf.getLong(localObject1[3], -1L);
                            i = bf.getInt(localObject1[4], -1);
                            if (l1 > 0L)
                            {
                              localObject1 = new java/lang/StringBuilder;
                              ((StringBuilder)localObject1).<init>();
                              localObject1 = l1 + "@chatroom";
                              com.tencent.mm.model.an.yt();
                              localObject1 = com.tencent.mm.model.c.wo().OI((String)localObject1);
                              if (localObject1 != null)
                              {
                                com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summerbadcr resetcrseq [%s] before [%d, %d, %d] [%d, %d, %d]", new Object[] { ((com.tencent.mm.storage.ad)localObject1).getUsername(), Long.valueOf(((com.tencent.mm.storage.ad)localObject1).aQB()), Long.valueOf(((com.tencent.mm.storage.ad)localObject1).pE()), Integer.valueOf(((com.tencent.mm.storage.ad)localObject1).aMH()), Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(i) });
                                if (l2 > -1L) {
                                  ((com.tencent.mm.storage.ad)localObject1).v(l2);
                                }
                                if (l3 > -1L) {
                                  ((com.tencent.mm.storage.ad)localObject1).u(l3);
                                }
                                if (i >= 0) {
                                  ((com.tencent.mm.storage.ad)localObject1).dv(i);
                                }
                                com.tencent.mm.model.an.yt();
                                i = com.tencent.mm.model.c.wo().a((com.tencent.mm.storage.ad)localObject1, ((com.tencent.mm.storage.ad)localObject1).getUsername(), false);
                                com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summerbadcr resetcrseq [%s] done [%d, %d, %d] ret:%d", new Object[] { ((com.tencent.mm.storage.ad)localObject1).getUsername(), Long.valueOf(((com.tencent.mm.storage.ad)localObject1).aQB()), Long.valueOf(((com.tencent.mm.storage.ad)localObject1).pE()), Integer.valueOf(((com.tencent.mm.storage.ad)localObject1).aMH()), Integer.valueOf(i) });
                                bool1 = true;
                                GMTrace.o(424262238208L, 3161);
                              }
                            }
                          }
                          catch (Exception localException1)
                          {
                            com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", localException1, "summerbadcr resetcrseq", new Object[0]);
                          }
                        }
                        final Object localObject2;
                        if (paramString.startsWith("//printchatroominfo"))
                        {
                          localObject2 = En_5b8fbb1e.a.uEw;
                          if (!o.dG((String)localObject2))
                          {
                            bool1 = false;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                          com.tencent.mm.model.an.yt();
                          paramContext = com.tencent.mm.model.c.ws().Oc((String)localObject2);
                          if (paramContext == null)
                          {
                            com.tencent.mm.sdk.platformtools.v.e("MicroMsg.CommandProcessor", "summercrinfo chatroomId[%s], member is null", new Object[] { localObject2 });
                            bool1 = false;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                          com.tencent.mm.model.an.vj().x(new Runnable()
                          {
                            public final void run()
                            {
                              GMTrace.i(414464344064L, 3088);
                              int i = this.hcQ.bDi();
                              int m = this.hcQ.field_chatroomdataflag;
                              int k = this.hcQ.bDl();
                              Object localObject1 = this.hcQ;
                              if (((q)localObject1).b(((q)localObject1).tyo)) {
                                ((q)localObject1).bDh();
                              }
                              int i1 = ((q)localObject1).tyo.status;
                              int j = this.hcQ.bDm();
                              localObject1 = this.hcQ;
                              if (((q)localObject1).b(((q)localObject1).tyo)) {
                                ((q)localObject1).bDh();
                              }
                              Object localObject3 = ((q)localObject1).tyo.gWk;
                              localObject1 = this.hcQ.Do();
                              com.tencent.mm.model.an.yt();
                              Object localObject2 = com.tencent.mm.model.c.wl().cl(localObject2, " and flag != 0 and msgSeq != 0");
                              boolean bool;
                              if ((localObject2 != null) && (((ca)localObject2).field_msgId > 0L)) {
                                bool = true;
                              }
                              for (;;)
                              {
                                com.tencent.mm.model.an.yt();
                                int n = com.tencent.mm.model.c.wl().xS(localObject2);
                                com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercrinfo chatroomId[%s], version[%d], flag[%d], type[%d], status[%d], get[%b], msgCount[%d], maxCount[%d], upgrader[%s], membersize[%d]", new Object[] { localObject2, Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i1), Boolean.valueOf(bool), Integer.valueOf(n), Integer.valueOf(j), localObject3, Integer.valueOf(((List)localObject1).size()) });
                                localObject2 = new StringBuilder();
                                ((StringBuilder)localObject2).append("---chatroominfo---\nid:").append(localObject2).append("\nver:").append(i).append("\nflag:").append(m).append("\ntype:").append(k).append("\nstatus:").append(i1).append("\nget:").append(bool).append("\nmsgCount:").append(n).append("\nmaxCount:").append(j).append("\nupgrader:").append((String)localObject3).append("\nmembersize:").append(((List)localObject1).size());
                                localObject3 = paramString.split(" ");
                                j = -1;
                                try
                                {
                                  i = bf.getInt(localObject3[1], 0);
                                  if (i != -1) {}
                                  for (;;)
                                  {
                                    j = i;
                                    if (i > ((List)localObject1).size()) {
                                      j = ((List)localObject1).size();
                                    }
                                    if (j <= 10) {
                                      break label577;
                                    }
                                    i = 10;
                                    if (i > 0) {
                                      ((StringBuilder)localObject2).append("\nmember:");
                                    }
                                    for (j = 0; j < i; j++) {
                                      ((StringBuilder)localObject2).append("\n").append((String)((List)localObject1).get(j));
                                    }
                                    bool = false;
                                    break;
                                    i = ((List)localObject1).size();
                                  }
                                  localObject1 = new av();
                                  ((av)localObject1).cG(localObject2);
                                  ((av)localObject1).dq(2);
                                  ((av)localObject1).setType(1);
                                  ((av)localObject1).z(System.currentTimeMillis());
                                  ((av)localObject1).setContent(((StringBuilder)localObject2).toString());
                                  com.tencent.mm.model.bb.g((av)localObject1);
                                  GMTrace.o(414464344064L, 3088);
                                  return;
                                }
                                catch (Exception localException)
                                {
                                  for (;;)
                                  {
                                    i = j;
                                    continue;
                                    label577:
                                    i = j;
                                  }
                                }
                              }
                            }
                          });
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.equals("//testupdate"))
                        {
                          paramString = "";
                          try
                          {
                            paramContext = bf.convertStreamToString(paramContext.getAssets().open("aplha_update_info.xml"));
                            com.tencent.mm.model.an.yt();
                            com.tencent.mm.model.c.uQ().set(352273, paramContext);
                            com.tencent.mm.model.an.yt();
                            com.tencent.mm.model.c.uQ().set(352274, Long.valueOf(System.currentTimeMillis()));
                            new com.tencent.mm.pluginsdk.model.app.a(paramContext).bvu();
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                          }
                          catch (IOException paramContext)
                          {
                            for (;;)
                            {
                              com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                              paramContext = paramString;
                            }
                          }
                        }
                        if ((paramString.equals("//checkUpdate0")) || (paramString.equals("//checkUpdate1")))
                        {
                          m.ah.buM().fP(paramString.equals("//checkUpdate1"));
                          m.ah.rEj = true;
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.equals("//debugsnstimelinestat"))
                        {
                          if (!com.tencent.mm.platformtools.r.iuL) {}
                          for (bool1 = true;; bool1 = false)
                          {
                            com.tencent.mm.platformtools.r.iuL = bool1;
                            Toast.makeText(com.tencent.mm.sdk.platformtools.aa.getContext(), "debugSnsTimelineStat: " + com.tencent.mm.platformtools.r.iuL, 0).show();
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                          }
                        }
                        if ((paramString.startsWith("//abtestmsg")) && (com.tencent.mm.sdk.a.b.bAT()))
                        {
                          paramContext = com.tencent.mm.model.c.a.gk(paramString.replace("//abtestmsg", ""));
                          com.tencent.mm.model.c.c.zY().i(paramContext.hwE, 0);
                          com.tencent.mm.model.c.c.zZ().i(paramContext.hwF, 1);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//triggergetabtest"))
                        {
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.uQ().a(v.a.tAy, Long.valueOf(1L));
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//vad"))
                        {
                          localObject2 = com.tencent.mm.sdk.platformtools.aa.bBx();
                          if (localObject2 == null)
                          {
                            bool1 = false;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                          if (paramString.startsWith("//vad get"))
                          {
                            com.tencent.mm.ui.base.g.y(paramContext, com.tencent.mm.av.a.c.LE(), "VAD PARAMS").show();
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                          paramContext = ((SharedPreferences)localObject2).edit();
                          if (paramString.startsWith("//vad sd")) {
                            paramContext.putInt("s_delay_time", Integer.valueOf(paramString.substring(9).trim()).intValue());
                          }
                          if (paramString.startsWith("//vad st")) {
                            paramContext.putInt("sil_time", Integer.valueOf(paramString.substring(9).trim()).intValue());
                          }
                          if (paramString.startsWith("//vad snr")) {
                            paramContext.putFloat("s_n_ration", Float.valueOf(paramString.substring(10).trim()).floatValue());
                          }
                          if (paramString.startsWith("//vad sw")) {
                            paramContext.putInt("s_window", Integer.valueOf(paramString.substring(9).trim()).intValue());
                          }
                          if (paramString.startsWith("//vad sl")) {
                            paramContext.putInt("s_length", Integer.valueOf(paramString.substring(9).trim()).intValue());
                          }
                          paramContext.apply();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//dumpabtestrecords"))
                        {
                          if (2 < com.tencent.mm.sdk.platformtools.v.getLogLevel())
                          {
                            bool1 = false;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                          if (paramString.contains("info")) {}
                          for (paramString = com.tencent.mm.model.c.c.zZ().bDd();; paramString = com.tencent.mm.model.c.c.zY().bDd())
                          {
                            localObject2 = new TextView(paramContext);
                            ((TextView)localObject2).setText(paramString);
                            ((TextView)localObject2).setGravity(8388627);
                            ((TextView)localObject2).setTextSize(1, 10.0F);
                            ((TextView)localObject2).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            ((TextView)localObject2).setTextColor(-16744704);
                            ((TextView)localObject2).setTypeface(Typeface.MONOSPACE);
                            ((TextView)localObject2).setMovementMethod(new ScrollingMovementMethod());
                            i = paramContext.getResources().getDimensionPixelSize(R.f.aYj);
                            ((TextView)localObject2).setPadding(i, i, i, i);
                            com.tencent.mm.ui.base.g.a(paramContext, null, (View)localObject2, null);
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                          }
                        }
                        if (paramString.startsWith("//triggerWebViewCookiesCleanup"))
                        {
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.uQ().a(v.a.tBF, Long.valueOf(0L));
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//cleanwebcache"))
                        {
                          paramContext = new bj();
                          com.tencent.mm.sdk.b.a.trT.y(paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//triggerWebViewCacheCleanup"))
                        {
                          paramString = new Intent();
                          paramString.setComponent(new ComponentName(d.g.tLY, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
                          paramString.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
                          paramContext.sendBroadcast(paramString);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//dumpsnsabtest"))
                        {
                          paramContext = new cb();
                          com.tencent.mm.sdk.b.a.trT.y(paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//dumpsilkvoicefile"))
                        {
                          com.tencent.mm.platformtools.r.iuP = true;
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//fucktit"))
                        {
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.uQ().a(v.a.tBs, Boolean.valueOf(true));
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//clog "))
                        {
                          paramContext = paramString.substring(7);
                          com.tencent.mm.plugin.report.service.g.opk.cH(paramContext, "test cLog " + System.currentTimeMillis());
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if ((paramString.startsWith("//testformsg")) && (com.tencent.mm.sdk.a.b.bAT()))
                        {
                          paramContext = paramString.substring(12).trim();
                          com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "MMCore.getSysCmdMsgExtension() " + com.tencent.mm.model.an.getSysCmdMsgExtension());
                          paramString = new bm();
                          paramString.sjk = com.tencent.mm.platformtools.n.mo(paramContext);
                          paramString.lSl = 10002;
                          paramContext = new d.a(paramString, false, false, false);
                          com.tencent.mm.model.an.getSysCmdMsgExtension().b(paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//canwebviewcachedownload"))
                        {
                          if (bf.getInt(bf.mq(paramString.substring(25)).trim(), 1) > 0) {}
                          for (bool1 = true;; bool1 = false)
                          {
                            com.tencent.mm.model.an.yt();
                            com.tencent.mm.model.c.uQ().a(v.a.tCc, Boolean.valueOf(bool1));
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                          }
                        }
                        if (paramString.startsWith("//canwebviewcacheprepushdownload"))
                        {
                          if (bf.getInt(bf.mq(paramString.substring(32)).trim(), 1) > 0) {}
                          for (bool1 = true;; bool1 = false)
                          {
                            com.tencent.mm.model.an.yt();
                            com.tencent.mm.model.c.uQ().a(v.a.tCd, Boolean.valueOf(bool1));
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                          }
                        }
                        if (paramString.startsWith("//resetsnslukcy"))
                        {
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.uQ().a(v.a.tCr, Boolean.valueOf(false));
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.uQ().a(v.a.tCs, Integer.valueOf(0));
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.uQ().a(v.a.tCt, Integer.valueOf(0));
                          paramContext = new pa();
                          com.tencent.mm.sdk.b.a.trT.y(paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//mmimgdec "))
                        {
                          paramString = paramString.substring(11);
                          if ("on".equalsIgnoreCase(paramString))
                          {
                            MMBitmapFactory.setUseMMBitmapFactory(true);
                            Toast.makeText(paramContext, "��������(png)����������", 0).show();
                          }
                          for (;;)
                          {
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                            if ("off".equalsIgnoreCase(paramString))
                            {
                              MMBitmapFactory.setUseMMBitmapFactory(false);
                              Toast.makeText(paramContext, "��������(png)����������", 0).show();
                            }
                          }
                        }
                        if (paramString.startsWith("//enablempsp"))
                        {
                          ak.a.ji(false);
                          Toast.makeText(paramContext, "����������������������", 0).show();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//disablempsp"))
                        {
                          ak.a.ji(true);
                          Toast.makeText(paramContext, "����������������������", 0).show();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//soterpay"))
                        {
                          com.tencent.mm.ba.c.v(paramContext, "fingerprint", ".ui.SoterPayTestUI");
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        paramContext.getString(R.m.foB);
                        if (paramString.startsWith("//getdltaskinfo"))
                        {
                          paramContext = paramString.replace("//getdltaskinfo ", "");
                          for (;;)
                          {
                            try
                            {
                              paramString = com.tencent.mm.pluginsdk.model.downloader.c.dR(bf.getLong(paramContext, 0L));
                              if (paramString == null) {
                                continue;
                              }
                              com.tencent.mm.sdk.platformtools.v.i("getdltaskinfo", "%d, %s, %s, %s", new Object[] { Long.valueOf(paramString.field_downloadId), paramString.field_downloadUrl, paramString.field_filePath, paramString.field_md5 });
                            }
                            catch (Exception paramString)
                            {
                              paramContext = com.tencent.mm.pluginsdk.model.downloader.c.Jz(paramContext);
                              if (paramContext == null) {
                                continue;
                              }
                              com.tencent.mm.sdk.platformtools.v.i("getdltaskinfo", "%d, %s, %s, %s", new Object[] { Long.valueOf(paramContext.field_downloadId), paramContext.field_downloadUrl, paramContext.field_filePath, paramContext.field_md5 });
                              continue;
                              com.tencent.mm.sdk.platformtools.v.i("getdltaskinfo", "infoURL null");
                              continue;
                            }
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                            com.tencent.mm.sdk.platformtools.v.i("getdltaskinfo", "infoID null");
                          }
                        }
                        if (paramString.startsWith("//testscan "))
                        {
                          if (!com.tencent.mm.platformtools.r.iuU) {}
                          for (bool1 = true;; bool1 = false)
                          {
                            com.tencent.mm.platformtools.r.iuU = bool1;
                            com.tencent.mm.platformtools.r.iuW = bf.getInt(paramString.replace("//testscan", "").trim(), 0);
                            com.tencent.mm.platformtools.r.iuX = 0;
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                          }
                        }
                        if (paramString.startsWith("//switchrecordmode"))
                        {
                          paramContext = com.tencent.mm.sdk.platformtools.aa.bBx();
                          bool2 = paramContext.getBoolean("settings_voicerecorder_mode", false);
                          if (!bool2)
                          {
                            bool1 = true;
                            paramContext.edit().putBoolean("settings_voicerecorder_mode", bool1).commit();
                            if (!bool2) {
                              break label13658;
                            }
                            Toast.makeText(com.tencent.mm.sdk.platformtools.aa.getContext(), "Turn off silk record", 1).show();
                          }
                          for (;;)
                          {
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                            bool1 = false;
                            break label13597;
                            Toast.makeText(com.tencent.mm.sdk.platformtools.aa.getContext(), "Turn on silk record", 1).show();
                          }
                        }
                        if (paramString.startsWith("//indoorsensorconfig "))
                        {
                          com.tencent.mm.modelstat.e.JO().kF(paramString.replace("//indoorsensorconfig ", ""));
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//testindoorsensor "))
                        {
                          paramContext = paramString.replace("//testindoorsensor ", "").split(",");
                          com.tencent.mm.modelstat.e.JO().a(12345, false, paramContext[0].equals("1"), bf.getFloat(paramContext[1], 0.0F), bf.getFloat(paramContext[2], 0.0F), 12);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//facedebug"))
                        {
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//rstfacett"))
                        {
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//switchjsc"))
                        {
                          paramString = paramString.replace("//switchjsc ", "");
                          paramContext = com.tencent.mm.sdk.platformtools.aa.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
                          if ("clear".equals(paramString)) {
                            paramContext.edit().remove("switch_x5_jscore").apply();
                          }
                          for (;;)
                          {
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                            if ("true".equals(paramString)) {
                              paramContext.edit().putBoolean("switch_x5_jscore", true).apply();
                            } else if ("false".equals(paramString)) {
                              paramContext.edit().putBoolean("switch_x5_jscore", false).apply();
                            }
                          }
                        }
                        if (paramString.startsWith("//rfcdn")) {
                          try
                          {
                            com.tencent.mm.modelcdntran.g.DE().keep_OnRequestDoGetCdnDnsInfo(888);
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                          }
                          catch (Exception paramContext)
                          {
                            for (;;)
                            {
                              com.tencent.mm.sdk.platformtools.v.e("MicroMsg.CommandProcessor", "rfcdn :%s", new Object[] { bf.f(paramContext) });
                            }
                          }
                        }
                        if (paramString.startsWith("//testcrscroll "))
                        {
                          localObject2 = paramString.split(" ");
                          if ((localObject2 != null) && (localObject2.length > 1))
                          {
                            En_5b8fbb1e.uEt = bf.getInt(localObject2[1], 0);
                            com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summerbadcr testscroll new BADCR_SCROLL_DELAY[%d]", new Object[] { Integer.valueOf(En_5b8fbb1e.uEt) });
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                        }
                        if (paramString.startsWith("//switchx5jscore"))
                        {
                          paramContext = com.tencent.mm.sdk.platformtools.aa.bBx();
                          bool1 = paramContext.getBoolean("switch_x5_jscore", true);
                          paramContext = paramContext.edit();
                          if (!bool1) {}
                          for (bool1 = true;; bool1 = false)
                          {
                            paramContext.putBoolean("switch_x5_jscore", bool1).apply();
                            bool1 = true;
                            GMTrace.o(424262238208L, 3161);
                            break;
                          }
                        }
                        if (paramString.startsWith("//testdefaultrsa"))
                        {
                          com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa");
                          com.tencent.mm.protocal.ac.F("", "", 0);
                          new com.tencent.mm.modelsimple.u("", "", "", 0).IU().a(com.tencent.mm.kernel.h.vf().uC().uG(), new com.tencent.mm.w.e()
                          {
                            public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.w.k paramAnonymousk)
                            {
                              GMTrace.i(14454443999232L, 107694);
                              com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa NetSceneManualAuth onSceneEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
                              if ((paramAnonymousInt1 == 4) && (paramAnonymousInt2 == -102))
                              {
                                com.tencent.mm.sdk.platformtools.ae.o(new Runnable()
                                {
                                  public final void run()
                                  {
                                    GMTrace.i(14453638692864L, 107688);
                                    b.w(b.7.this.val$context, "RSA(req) fatal err, must recheck!!!");
                                    GMTrace.o(14453638692864L, 107688);
                                  }
                                });
                                GMTrace.o(14454443999232L, 107694);
                              }
                              for (;;)
                              {
                                return;
                                new com.tencent.mm.modelsimple.m().a(com.tencent.mm.kernel.h.vf().hfs.hBa, new com.tencent.mm.w.e()
                                {
                                  public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.w.k paramAnonymous2k)
                                  {
                                    GMTrace.i(14454175563776L, 107692);
                                    com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa  NetSceneGetCert onSceneEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
                                    if ((paramAnonymous2Int1 == 4) && (paramAnonymous2Int2 == -102))
                                    {
                                      com.tencent.mm.sdk.platformtools.ae.o(new Runnable()
                                      {
                                        public final void run()
                                        {
                                          GMTrace.i(14453370257408L, 107686);
                                          b.w(b.7.this.val$context, "RSA(base) fatal err, must recheck!!!");
                                          GMTrace.o(14453370257408L, 107686);
                                        }
                                      });
                                      GMTrace.o(14454175563776L, 107692);
                                    }
                                    for (;;)
                                    {
                                      return;
                                      Toast.makeText(b.7.this.val$context, "DefaultRSA check pass", 0).show();
                                      b.w(b.7.this.val$context, "");
                                      GMTrace.o(14454175563776L, 107692);
                                    }
                                  }
                                });
                                GMTrace.o(14454443999232L, 107694);
                              }
                            }
                          });
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        if (paramString.startsWith("//dumpdefaultrsa"))
                        {
                          bool1 = w(paramContext, "");
                          GMTrace.o(424262238208L, 3161);
                          continue;
                        }
                        i = dJ(paramString);
                        com.tencent.mm.sdk.platformtools.v.d("MicroMsg.CommandProcessor", "processed : in ret:[%d]", new Object[] { Integer.valueOf(i) });
                        switch (i)
                        {
                        default: 
                          bool1 = false;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 0: 
                          bool1 = false;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 568: 
                          Assert.assertTrue("test errlog", false);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 569: 
                          com.tencent.mm.model.an.yt().wP();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 570: 
                          if (com.tencent.mm.storage.bb.Ps(dK(paramString))) {
                            Toast.makeText(paramContext, R.m.foh, 0).show();
                          }
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 571: 
                          paramContext = dK(paramString);
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.uQ().set(8195, paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 572: 
                          com.tencent.mm.sdk.platformtools.f.fGN = Integer.valueOf(dK(paramString)).intValue();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 574: 
                          paramString = new StringBuilder().append(com.tencent.mm.compatible.d.p.rp());
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.ui.base.g.y(paramContext, com.tencent.mm.a.g.n(com.tencent.mm.model.c.uf().getBytes()), "md5");
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 579: 
                          paramContext = dK(paramString);
                          af.a.yd().I(paramContext, "");
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 580: 
                          com.tencent.mm.model.an.uC().d(new bd(new bd.a()
                          {
                            public final void a(com.tencent.mm.network.e paramAnonymouse)
                            {
                              GMTrace.i(14454712434688L, 107696);
                              if (paramAnonymouse == null) {
                                GMTrace.o(14454712434688L, 107696);
                              }
                              for (;;)
                              {
                                return;
                                paramAnonymouse = paramAnonymouse.Bx();
                                com.tencent.mm.model.an.yt();
                                int i = com.tencent.mm.model.c.uf();
                                paramAnonymouse.i(new byte[0], i);
                                GMTrace.o(14454712434688L, 107696);
                              }
                            }
                          }));
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 581: 
                          paramContext = dK(paramString);
                          com.tencent.mm.pluginsdk.model.app.am.bvL().Jl(paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 582: 
                          paramContext = dK(paramString);
                          com.tencent.mm.model.an.yt();
                          paramContext = com.tencent.mm.model.c.wj().Oy(paramContext);
                          if ((paramContext == null) || (paramContext.tx() == 0))
                          {
                            bool1 = false;
                            GMTrace.o(424262238208L, 3161);
                            continue;
                          }
                          paramContext.sU();
                          o.r(paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 583: 
                          com.tencent.mm.model.an.yt();
                          com.tencent.mm.model.c.wQ();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 584: 
                        case 585: 
                          com.tencent.mm.model.bc.fU(dK(paramString));
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 586: 
                          paramContext = paramString.split(" ");
                          if ((paramContext != null) && (paramContext.length == 3)) {
                            com.tencent.mm.modelmulti.t.aQ(bf.getInt(paramContext[1], 0), bf.getInt(paramContext[2], 0));
                          }
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 587: 
                          paramContext = new cc();
                          com.tencent.mm.sdk.b.a.trT.y(paramContext);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 588: 
                          com.tencent.mm.a.e.aR("/sdcard/tencent/MicroMsg/back");
                          com.tencent.mm.model.an.yt();
                          j.o(com.tencent.mm.model.c.wN(), "/sdcard/tencent/MicroMsg/back", false);
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        case 590: 
                          paramString = com.tencent.mm.sdk.platformtools.aa.bBz();
                          int m = com.tencent.mm.compatible.d.r.getInt(201, 0);
                          i = paramString.getInt("com.tencent.mm_device_today_step", m);
                          com.tencent.mm.compatible.d.r.ax(201, i);
                          long l4 = com.tencent.mm.compatible.d.r.getLong(202, 0L);
                          l1 = paramString.getLong("com.tencent.mm_device_today_time", l4);
                          com.tencent.mm.compatible.d.r.i(202, l1);
                          j = com.tencent.mm.compatible.d.r.getInt(203, 0);
                          int k = paramString.getInt("com.tencent.mm_device_previous_step", j);
                          com.tencent.mm.compatible.d.r.ax(203, k);
                          l2 = com.tencent.mm.compatible.d.r.getLong(204, 0L);
                          l3 = paramString.getLong("com.tencent.mm_device_last_step_time", l2);
                          com.tencent.mm.compatible.d.r.i(204, l3);
                          com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "step data migration succ.(tStepCfg:%s, tStepSp:%s, tTimeCfg:%s, tTimeSp:%s, pStepCfg:%s, pStepSp:%s, lStepCfg:%s, lStepSp:%s)", new Object[] { Integer.valueOf(m), Integer.valueOf(i), Long.valueOf(l4), Long.valueOf(l1), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l2), Long.valueOf(l3) });
                          Toast.makeText(paramContext, String.format("step data migration succ.(tStepCfg:%s, tStepSp:%s, tTimeCfg:%s, tTimeSp:%s, pStepCfg:%s, pStepSp:%s, lStepCfg:%s, lStepSp:%s)", new Object[] { Integer.valueOf(m), Integer.valueOf(i), Long.valueOf(l4), Long.valueOf(l1), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l2), Long.valueOf(l3) }), 1).show();
                          bool1 = true;
                          GMTrace.o(424262238208L, 3161);
                          break;
                        }
                        try
                        {
                          paramContext = paramString.split(" ");
                          if ((paramContext != null) && (paramContext.length > 1))
                          {
                            paramContext = bg.q(paramContext[0], "sysmsg");
                            com.tencent.mm.model.an.yt().wT().k(paramContext);
                          }
                        }
                        catch (Exception paramContext)
                        {
                          for (;;)
                          {
                            com.tencent.mm.sdk.platformtools.v.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "hy: error occured in commandProcessor", new Object[0]);
                          }
                        }
                        bool1 = true;
                        GMTrace.o(424262238208L, 3161);
                      }
                      catch (Exception paramContext)
                      {
                        for (;;) {}
                      }
                    }
                    catch (Exception paramContext)
                    {
                      for (;;) {}
                    }
                  }
                  catch (Exception paramContext)
                  {
                    for (;;) {}
                  }
                }
                catch (Exception paramContext)
                {
                  for (;;) {}
                }
              }
              catch (Exception paramContext)
              {
                for (;;) {}
              }
            }
            catch (Exception paramContext)
            {
              for (;;) {}
            }
          }
          catch (Exception paramContext)
          {
            for (;;) {}
          }
        }
        catch (Exception paramContext)
        {
          label8387:
          label13597:
          label13658:
          for (;;) {}
        }
      }
    }
  }
  
  public static boolean w(Context paramContext, String paramString)
  {
    boolean bool = true;
    GMTrace.i(14453772910592L, 107689);
    StringBuffer localStringBuffer = new StringBuffer();
    if (!bf.ld(paramString)) {
      localStringBuffer.append(paramString + "\n\n");
    }
    localStringBuffer.append("Default RSA Info:\n");
    localStringBuffer.append("ClientVersion: " + com.tencent.mm.sdk.platformtools.e.CLIENT_VERSION + "\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_VERSION = 153\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_KEYN = A2BDEEA41304F1D2EF8AF1C190EAD707C81D73850FCF6A95AD8E67330D9C7D52A3524093E925D11C9D010404A8B6D52726950753764C279F56FC5BB8CD72F4547B03A6F7DC8537F43E86F59EE181730567B406332AB464313B46A475B4B6516774D3D5B8EDD6EBAC5DADA21E6773EBAA3D217451749F405610C8C226965F0BB6FA7637C24165A62BDE6B4B5BDDBA9A32307079474A1373FE3F945523D381BB4F3069420530484792A87496A53F44C6135E6BF3471655AA138843E3B648D7003823654B618C08426FC11DA2C75ED4E9384EA9BFCB8388F6E269FC45CAF13C57BC2CDA6463B83985B1D8E7821AB9E5FDAC9ACE8D28AFB647786AF3395969D33473 len(512" + ")\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_KEYE = 010001\n\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_VERSION = 154\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_KEYN = B3A65FC1A419007808172134F44BBF42C62287D014F13C0F73073151F212B6F378DA85596AC56E8848E070454FA84EAF41F96340CB8B8BDF83C0B1F002909FAE6F142966C22C101D363C5DC1F9F707F08AEF1E1A7DAF14231BBBB854D2B57D5EED7A4E29763368B61968848D1192D3F1D126F6E8824BF16627426B349F22F179E5E034F92D96ED14246FBB021765CC3D7CF240BDB851518C3B5C244FD1EB042F686BF32F024A92A155C0EA62E39B792344BAFDBBF22E849F0DC69D88CA668322320439CEE72E12741676EE7AA76242FCA6D7A1D0CD8056D05BBCC748485D493C9BD85FA95CB6D540E093C86089F4C8EC5E11692DE1B9FF45E6D7E648131AE0CB len(512" + ")\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_KEYE = 010001\n");
    com.tencent.mm.sdk.platformtools.v.i("MicroMsg.CommandProcessor", "summercert dumpdefaultrsa " + localStringBuffer.toString());
    if (!com.tencent.mm.sdk.a.b.bAT())
    {
      bool = false;
      GMTrace.o(14453772910592L, 107689);
    }
    for (;;)
    {
      return bool;
      paramString = new TextView(paramContext);
      paramString.setText(localStringBuffer.toString());
      paramString.setGravity(19);
      paramString.setTextSize(1, 10.0F);
      paramString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramString.setTextColor(-16711936);
      paramString.setTypeface(Typeface.MONOSPACE);
      int i = paramContext.getResources().getDimensionPixelSize(R.f.aYK);
      paramString.setPadding(i, i, i, i);
      paramString.setMovementMethod(ScrollingMovementMethod.getInstance());
      com.tencent.mm.ui.base.g.a(paramContext, null, paramString, null);
      if (com.tencent.mm.protocal.ac.bzX()) {
        Toast.makeText(paramContext, "dump file:" + com.tencent.mm.compatible.util.e.hnx + "DefaultRSA.java", 1).show();
      }
      GMTrace.o(14453772910592L, 107689);
    }
  }
}
