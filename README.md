<div align="center">

<img src="assets/banner.png" alt="YaicaGram" width="640">

**YaicaGram — Telegram fork for Android.**
Fork with extra tweaks, egg themes, Python plugins and custom settings.
Built from [DrKLO/Telegram](https://github.com/DrKLO/Telegram) with the patch in this repository.

[Русский](README.ru.md) · [中文](README.zh.md)

[![channel](https://img.shields.io/badge/channel-xonesuper-FFD54F?style=flat-square&logo=telegram&logoColor=black)](https://t.me/xonesuper)
[![creator](https://img.shields.io/badge/creator-desrteagle-FFD54F?style=flat-square&logo=telegram&logoColor=black)](https://t.me/desrteagle)
[![licence](https://img.shields.io/badge/licence-GPL--2.0--or--later-FFD54F?style=flat-square)](#licence)

</div>

---

Package `cat.bodayse.yaicagram`. It installs **next to** the official Telegram, not over it. arm64 only.

Everything the fork adds lives in one place: **Settings → YaicaGram**, the first row.

## Features

<details>
<summary><b>Signature "Egg" Theme & Custom Palette</b></summary>

On first launch, YaicaGram activates Telegram's dark *Night* theme with a warm Egg Yolk Yellow accent (`#FFD54F`). Several launcher icon variants are provided in Settings (Egg Yellow, White, Night, Sand, Lavender, Mint).
</details>

<details>
<summary><b>A message field that grows as far as you want</b></summary>

Stock Telegram stops the input box at six lines and starts scrolling. In YaicaGram you pick: 2 to 15 lines, or *max* — grow while there is room on the screen. The text size inside the box is adjustable too.

The 4096-character limit per message stays (enforced by Telegram servers).
</details>

<details>
<summary><b>The message field can move to the top of the chat</b></summary>

Moves under the chat header, and the room reserved for it in the message list moves up as well. The keyboard and attachment panels stay at the bottom.
</details>

<details>
<summary><b>Music tags: title, artist, cover</b></summary>

Long-press a track in a chat, then **Track tags**. Done directly on your device without third-party bots. The cover is cropped with Telegram's avatar cropper.
</details>

<details>
<summary><b>Streamer mode</b></summary>

Your phone number is hidden with dots everywhere the app shows it, with options to hide other people's phone numbers and your username.
</details>

<details>
<summary><b>Numeric IDs in profiles</b></summary>

A row with the numeric ID appears in profiles of people, bots, groups and channels. Tap to copy.
</details>

<details>
<summary><b>Deleted gifts</b></summary>

Gifts removed from the official Telegram catalog are restored to the list. Purchase is verified by the server.
</details>

<details>
<summary><b>Built-in WebSocket Proxy</b></summary>

Wraps MTProto connection into WebSocket directly to Telegram's data centers without intermediate third-party servers.
</details>

<details>
<summary><b>Easter Eggs & Egg Sound</b></summary>

Tap the header on the main screen to hear a sound with a squish animation. Tap the "Chats" button rapidly 7 times for more surprises! Want to submit an easter egg? Contact [@desrteagle](https://t.me/desrteagle).
</details>

<details>
<summary><b>Python plugins (.marp)</b></summary>

Settings → YaicaGram → Plugins. Plugins are Python scripts bundled with a manifest. Also supports importing plugins written for exteraGram.
</details>

## Building

You need Android SDK 35 (build-tools 35.0.0), NDK 27.2.12479018, and JDK 21.

```bash
git clone https://github.com/DrKLO/Telegram
cd Telegram
git checkout $(cat ../YaicaGram/patch/UPSTREAM)
git submodule update --init --recursive
git apply ../YaicaGram/patch/margelet.patch
gradle :TMessagesProj_AppStandalone:assembleAfatStandalone
```

## Contributors

- **[@desrteagle](https://t.me/desrteagle)** (GitHub: [@bodayse4real](https://github.com/bodayse4real)) — Lead Developer & Project Creator
- **Google Gemini / Antigravity** — AI Co-Author & Architecture Assistant

## Licence

Telegram's sources are licensed under GPL v2 or later, and YaicaGram inherits that.
