# toy-project_AI-JACK

## ๐ Toy Project - ์์ ์ถ์ฒ AI Jack
> ๊ธฐ๋ถ์ ๋ฐ๋ผ, ์์ ์ข๋ฅ์ ๋ฐ๋ผ ์์์ ์ถ์ฒํด์ฃผ๋ ํ๋ก๊ทธ๋จ

<br>

## 1. ์ ์ ๊ธฐ๊ฐ & ์ฐธ์ฌ ์ธ์
- 2022๋ 03์ 23์ผ ~ 2022๋ 04์ 05์ผ
- ๊ฐ์ธ ํ๋ก์ ํธ

</br>

## 2. ์ฌ์ฉ ๊ธฐ์ 
  - Java 8

</br>

## 3. Class ๊ตฌ์ฑ
![](https://velog.velcdn.com/images/jack_whiteblack/post/8d745fd3-1520-49d3-b7eb-e8f384b0014b/image.png) 
- Jack(Main), Feeling(๊ธฐ๋ถ), Kind(์์ ์ข๋ฅ)๋ก 3๊ฐ์ Class๋ก ์ด๋ฃจ์ด์ ธ ์๋ค.

<br>

## 4. ํต์ฌ ๊ธฐ๋ฅ (๊ฐ Class์ ๋ํ ์ค๋ช) 

<details>
<summary><b>JACK CLASS</b></summary>
<div markdown="1">

#### 01. equalsIgnoreCase() : ๐ [์ฝ๋ ํ์ธ](https://github.com/JONGHWI-PARK/toy-project_AI-JACK/blob/2c651902652bca406636182003a6ba488000a4b2/src/project01/Jack.java#L28)
![](https://velog.velcdn.com/images/jack_whiteblack/post/74112304-740f-47ad-aabb-bd9f7e0c6908/image.png) 
- equals()์ ๊ฐ์ด ๋ฌธ์์ด์ ๋น๊ตํ  ๋ ์ฌ์ฉ
: equals()๋ ๋์๋ฌธ์๋ฅผ ๊ตฌ๋ถํด์ผ ํ์ง๋ง equalsIgnoreCase()๋ ๋์๋ฌธ์๋ฅผ ๊ตฌ๋ถํ์ง ์์๋ ๋๊ธฐ ๋๋ฌธ์ ์ด๊ฒ์ ์ฌ์ฉํ์๋ค.

#### 02. indexOf() : ๐ [์ฝ๋ ํ์ธ](https://github.com/JONGHWI-PARK/toy-project_AI-JACK/blob/2c651902652bca406636182003a6ba488000a4b2/src/project01/Jack.java#L34)
![](https://velog.velcdn.com/images/jack_whiteblack/post/8d1828e8-144c-4223-bd87-c24b6d2c728b/image.png)
- indexOf()์ ํน์  ๋ฌธ์ ์์น ์กฐํ๋ฅผ ํ์ฉํ์ฌ ํน์  ๋ฌธ์๋ฅผ ์ถ๋ ฅํ  ์ ์๋๋ก ํ์๋ค.

</div>
</details>

<details>
<summary><b>FEELING CLASS</b></summary>
<div markdown="1">

#### 01. Keywords : ๐ [์ฝ๋ ํ์ธ](https://github.com/JONGHWI-PARK/toy-project_AI-JACK/blob/2c651902652bca406636182003a6ba488000a4b2/src/project01/Feeling.java#L10)
![](https://velog.velcdn.com/images/jack_whiteblack/post/d3c86f9d-cbf1-4818-a5d2-777a61d7c177/image.png)

- ์ค์  AI Siri์ ๋ํํ๋ฏ์ด ํ๋ก๊ทธ๋จ์ด ์งํ๋์์ผ๋ฉด ํด์ ์ง๋ฌธ๊ณผ ๋๋ต์ ํค์๋๋ฅผ ๋ฏธ๋ฆฌ ์๋ ฅํด๋์๋ค. <br>
์ง๋ฌธ์ด๋ ๋๋ต ์๋ ฅ ์, ์ ์ฅ๋ ํค์๋๊ฐ ํฌํจ๋์ด์๋ ๊ฒ์ ํ์ธํ๊ณ  ๋ค์ ์ฝ๋๋ก ๋์ด ๊ฐ์ ์๊ฒ ์ฝ๋ ์์ฑ์ ํ์๋ค.
  <br>
  - ์ถํ ํค์๋ ์ถ๊ฐ ๋ฐ ์ญ์  ๊ฐ์ ์ ์ง๋ณด์๊ฐ ์ฉ์ดํ๊ฒ ํ๊ธฐ ์ํด ๋ฐฐ์ด์ ์ด์ฉํ์ฌ ๋ฐ์ดํฐ๋ฅผ ์ ์ฅํ์๋ค.

#### 02. Random( ) : ๐ [์ฝ๋ ํ์ธ](https://github.com/JONGHWI-PARK/toy-project_AI-JACK/blob/2c651902652bca406636182003a6ba488000a4b2/src/project01/Feeling.java#L32)
![](https://velog.velcdn.com/images/jack_whiteblack/post/f1e25d12-488a-4729-95f9-732fb7f3470e/image.png)

- Random( ) ํจ์๋ฅผ ์ด์ฉํด ๋ฐฐ์ด ๊ฐ๋ค์ ๋๋ค์ผ๋ก ์ถ๋ ฅํ๋๋ก ํ์๋ค.

</div>
</details>

<details>
<summary><b>KIND CLASS</b></summary>
<div markdown="1">

#### 01. Contains( ) : ๐ [์ฝ๋ ํ์ธ](https://github.com/JONGHWI-PARK/toy-project_AI-JACK/blob/2c651902652bca406636182003a6ba488000a4b2/src/project01/Kind.java#L35)
![](https://velog.velcdn.com/images/jack_whiteblack/post/9a72c4bd-8ead-4858-bf71-2f1113de9ef2/image.png)
- indexOf() ๋์  ์ฌ์ฉํ๋ ์ด์ 
      : ํน์  ๋ฌธ์์ด์ ๋ ๊ฐ๋จํ๊ฒ ์ทจํ  ์ ์์ด ์ฌ์ฉํ๋ค.
  <br>
  <br>
- equals() ๋์  ์ฌ์ฉํ๋ ์ด์ 
      : ์์ดํฐ์ Siri์ ๋ํํ๋ ๊ฒ์ฒ๋ผ ํ๊ณ  ์ถ์๋ค. <br>
      equals()๋ ์๋ ฅ ์, ์ง์ ํ ๋ฌธ์์ด๊ณผ ์ ํํ๊ฒ ์ผ์นํด์ผ ๋๊ธฐ ๋๋ฌธ์ contains()๋ฅผ ์ฌ์ฉํ์ฌ ์ง์  ๋ฌธ์์ด๋ง ํฌํจ๋๋ฉด ์์ ๋กญ๊ฒ ๋ฌธ์ฅ ๊ตฌ์ฑ์ ํ  ์ ์๊ฒ ํ์๋ค.

</div>
</details>

</br>

## 5. ์์ฐ ์์
- ์์ ์ข๋ฅ ํธ
![](https://velog.velcdn.com/images/jack_whiteblack/post/52d43bb1-b77c-449e-a9ea-fc77724f7bb9/image.gif)

<br>

- ๊ธฐ๋ถ ํธ
![](https://velog.velcdn.com/images/jack_whiteblack/post/8f92c41c-24c7-438f-9792-5257c22c2f49/image.gif)

</br>

## 6. ํ๋ก์ ํธ ํ๊ธฐ
์ฝ๋ฉ์ ๋ฐฐ์ฐ๊ณ  ์ฒซ ํ๋ก์ ํธ์๋ค. ๋ด๊ฐ ์ฝ๋ฉํ๋๋ก ๊ตฌํ์ด ๋๋ ๋งํ  ์ ์๋ ์ฑ์ทจ๊ฐ์ ๋๊ผ๋ค. <br>
์ญ์ ์ด ๋ง์ ๋ฌด์ธ๊ฐ๋ฅผ ๋ง๋๋ ๊ฒ ๊ฐ๋ค. 

<br>

java๋ฅผ ๊ณต๋ถํ๋ฉด์ ๋ถ์กฑํ ๋ถ๋ถ์ด ๋ง์๋๋ฐ ์ผ๋ถ๋ถ์ ํ๋ก์ ํธ ํ๋ฉด์ ๊ณต๋ถ๊ฐ ๋์๊ณ  ๋ ์ผ๋ถ๋ถ์ ์์ง ๋ถ์กฑํ ์ํ์ด๋ค. <br>
๊ทธ๋๋ ํ๋ก์ ํธ๋ฅผ ํตํด ๋ด๊ฐ ์ด๋ค ๋ถ๋ถ์ด ๋ถ์กฑํ์ง๋ฅผ ์๊ฒ ๋์์ผ๋ ์์ผ๋ก ์ฑ์๋๊ฐ ๊ฒ์ด๋ค.

<br>

ํ๋ก์ ํธ ๊ฐ๋ฐ ๊ด๋ จ ๊ธ : [Toy Project - ์์ ์ถ์ฒ AI Jack](https://velog.io/@jack_whiteblack/Toy-Project-%EC%9D%8C%EC%8B%9D-%EC%B6%94%EC%B2%9C-AI-Jack)
