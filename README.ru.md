<div align="center">

<img src="assets/banner.png" alt="YaicaGram" width="640">

**YaicaGram — форк Telegram для Android.**
Клиент с расширенными настройками, фирменной темой «Яйцо», плагинами на Python и пасхалками.
Собирается из официального [DrKLO/Telegram](https://github.com/DrKLO/Telegram) с патчем из этого репозитория.

[English](README.md) · [中文](README.zh.md)

[![канал](https://img.shields.io/badge/канал-xonesuper-FFD54F?style=flat-square&logo=telegram&logoColor=black)](https://t.me/xonesuper)
[![создатель](https://img.shields.io/badge/создатель-desrteagle-FFD54F?style=flat-square&logo=telegram&logoColor=black)](https://t.me/desrteagle)
[![лицензия](https://img.shields.io/badge/лицензия-GPL--2.0--or--later-FFD54F?style=flat-square)](#лицензия)

</div>

---

Пакет `cat.bodayse.yaicagram`. Встаёт **рядом** с официальным Telegram, не поверх. Только arm64.

Всё, что добавляет форк, собрано в одном месте: **Настройки → YaicaGram**, первой строкой.

## Возможности

<details>
<summary><b>Фирменная яичная тема и иконки</b></summary>

При первом запуске YaicaGram включает тему *Night* с тёплым золотисто-жёлтым акцентом яичного желтка (`#FFD54F`). В настройках доступны несколько вариантов иконок (Яичная, Белок, Ночная, Песочная, Лавандовая, Розовая).
</details>

<details>
<summary><b>Поле ввода растёт настолько, насколько нужно</b></summary>

В обычном Telegram поле останавливается на 6 строках и начинает скроллиться. В YaicaGram можно выбрать от 2 до 15 строк или режим «макс.» — поле растёт, пока есть место на экране. Размер шрифта в поле ввода также настраивается.

Лимит Telegram в 4096 знаков на сообщение сохраняется.
</details>

<details>
<summary><b>Поле ввода сверху чата</b></summary>

Поле ввода переезжает под верхнюю плашку чата, освобождая обзор сообщений.
</details>

<details>
<summary><b>Теги музыки: название, артист, обложка</b></summary>

Долгое нажатие на трек в чате → **Теги трека**. Редактирование прямо на устройстве без сторонних ботов.
</details>

<details>
<summary><b>Режим стримера</b></summary>

Скрывает номер телефона точками во всём приложении, с возможностью скрыть также чужие номера и юзернейм.
</details>

<details>
<summary><b>Числовые ID в профилях</b></summary>

Строка с числовым идентификатором в профилях пользователей, каналов, ботов и групп. Нажатие копирует ID.
</details>

<details>
<summary><b>Удалённые подарки</b></summary>

Подарки, убранные Telegram из каталога, возвращаются в список доступных для отправки.
</details>

<details>
<summary><b>Встроенный WebSocket-прокси</b></summary>

Заворачивает MTProto-соединение в WebSocket к дата-центрам Telegram без сторонних серверов.
</details>

<details>
<summary><b>Пасхалки и яичные звуки</b></summary>

Нажатие на название в шапке главного экрана воспроизводит звук с мягким приседанием надписи. Быстрое нажатие на кнопку «Чаты» 7 раз открывает скрытый экран! Хотите добавить свою пасхалку? Пишите [@desrteagle](https://t.me/desrteagle).
</details>

<details>
<summary><b>Плагины на Python (.marp)</b></summary>

Настройки → YaicaGram → Плагины. Поддержка плагинов, написанных на чистом Python, а также импорт и конвертация плагинов от exteraGram.
</details>

## Сборка

Требуются: Android SDK 35 (build-tools 35.0.0), NDK 27.2.12479018, JDK 21.

```bash
git clone https://github.com/DrKLO/Telegram
cd Telegram
git checkout $(cat ../YaicaGram/patch/UPSTREAM)
git submodule update --init --recursive
git apply ../YaicaGram/patch/margelet.patch
# укажите свои api_id / api_hash из https://my.telegram.org в
# TMessagesProj/src/main/java/org/telegram/messenger/BuildVars.java
gradle :TMessagesProj_AppStandalone:assembleAfatStandalone
```

Готовый APK сохраняется в `TMessagesProj_AppStandalone/build/outputs/apk/afat/standalone/`.

## Лицензия

Исходный код Telegram распространяется под лицензией GPL v2 или новее. YaicaGram наследует условия лицензии GPL v2+.
