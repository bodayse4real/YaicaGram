<div align="center">

<img src="assets/banner.png" alt="YaicaGram" width="640">

**YaicaGram — 适用于 Android 的 Telegram 分支客户端。**
具有高级设置、特色鸡蛋黄主题、Python 插件与彩蛋。
基于官方 [DrKLO/Telegram](https://github.com/DrKLO/Telegram) 和本仓库中的补丁构建。

[English](README.md) · [Русский](README.ru.md)

[![频道](https://img.shields.io/badge/频道-xonesuper-FFD54F?style=flat-square&logo=telegram&logoColor=black)](https://t.me/xonesuper)
[![作者](https://img.shields.io/badge/作者-desrteagle-FFD54F?style=flat-square&logo=telegram&logoColor=black)](https://t.me/desrteagle)
[![许可证](https://img.shields.io/badge/许可证-GPL--2.0--or--later-FFD54F?style=flat-square)](#许可证)

</div>

---

包名 `cat.bodayse.yaicagram`。与官方 Telegram **共存安装**。仅限 arm64。

所有分支添加的功能都集中在：**设置 → YaicaGram**。

## 构建方法

环境需求：Android SDK 35 (build-tools 35.0.0)，NDK 27.2.12479018，JDK 21。

```bash
git clone https://github.com/DrKLO/Telegram
cd Telegram
git checkout $(cat ../YaicaGram/patch/UPSTREAM)
git submodule update --init --recursive
git apply ../YaicaGram/patch/margelet.patch
gradle :TMessagesProj_AppStandalone:assembleAfatStandalone
```

生成的 APK 位于 `TMessagesProj_AppStandalone/build/outputs/apk/afat/standalone/`。

## 许可证

Telegram 源码基于 GPL v2 或更高版本开源，YaicaGram 遵循相同条款。
