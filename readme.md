### 关于Glide加载gif优化

        Glide加载gif表现效果不佳，常见问题：卡顿、占用cpu高
        
        常见解决方案是添加缓存策略（diskCacheStrategy(DiskCacheStrategy.DATA)）,虽然有一定效果，但是表现并不如意。
        glide支持自定义解码方式，于是可以通过framesequence这个库来解析gif,从而提升glide加载gif流畅度、降低内存和cpu使用量,
        framesequence是Androidframework中ex里的一个工具包，该包需要单独打包，不能直接使用，它依赖giflib和webp。
        
#### 编译.so库
    
        1.下载相关源码
        framesequence源码地址：
            https://android.googlesource.com/platform/frameworks/ex/
        giflib源码地址：
            https://android.googlesource.com/platform/external/giflib/
        
        2.解压下载的源码文件，把framesequence中jni文件复制到项目的main文件下，把giflib的源码放到jni的giflib文件下
        
        3.在jni文件下创建Android.mk和Application。mk，详情请看文件
        
        4.在Terminal窗口中，进到jni文件，然后输入命令ndk-build，编译生成.so
        
        5.把framesequence中的src文件下的文件复制到项目中，切莫更改FrameSequence和FrameSequenceDrawable包名
        
        至此，framesequence就可以使用了，相关使用可参考framesequence中的samples
            
        注意：生成.so方式有多种，这里只写我会用的方式；由于没有使用到webp，可以不集成，但是giflib必须集成。
        
    