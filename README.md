# گزارش انجام آزمایش TDD
- ریپازیتوری آزمایش به همراه تخته kanban تعریف شد.
- در ابتدا، مالک محصول تیم وظایف افراد را با یک سری جزئیات مشخص کرد:
- ![image_2024-03-11_18-13-20](https://github.com/seftaz/Experiment-TDD/assets/79265096/237a6454-8f67-48d7-a999-800313d35576)

- سپس، افراد و تخمین زمانی وظایف مشخص شدند:
- ![image_2024-03-11_18-16-37](https://github.com/seftaz/Experiment-TDD/assets/79265096/3ce6bb3f-98ea-4661-98c5-5eda3f15d357)


## بخش اول آزمایش: پیدا کردن ایرادها

### فرایند پیدا کردن ایرادها و اصلاح آن‌ها
- برنچ hotfix/Library.java-fix:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/c15d81d6-4e37-445a-a2f1-fa949eaf570e)

- ایراد اول عدم چک کردن دانشجو در لایبری:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/cda36ecf-315d-4e30-b7d6-164dbf9a5334)

- ایراد دوم عدم حذف کتاب از دانشجو:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/9ce2035d-aa09-4549-808f-87761ffce574)

- ساخت ۲ تست برای نمایش باگ ها:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/35220f75-37a7-4d9b-9228-3286f713ea2c)

- عدم پاس شدن تست ها:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/6918c7b7-6631-469c-a8ca-6d8a85350107)

- پاس شدن تست ها بعد از رفع باگ:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/2430f880-86e2-4ea2-bc06-344dda3bc595)

- ثبت درخواست merge (pull request):
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/82e1e0e6-e976-4121-867a-9670af8f7112)

- انجام review و تایید merge:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/6b90b309-735b-4a17-b9aa-1570299515dd)

- ثبت کار به عنوان done:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/3c288121-7672-4c57-add4-34f282c33700)


## بخش دوم آزمایش: پیاده‌سازی توابع جستجو

### فرایند نوشتن تست و پیاده‌سازی توابع جستجو دانش‌آموز توسط آراد:
#### جستجو با type
- استثنائا این تابع چون با بدنه خالی null بر می‌گرداند و در تست انتظار null داریم، از ابتدا تستش پاس می‌شود. بعد از تکمیل کد نیز در تصویر دوم مشخص است که تست پاس می‌شود:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/2442178a-ebb4-4b16-87cc-36d9d1f02256)
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/4693911b-5f70-4914-9a8d-bfae2c2d8199)

#### جستجو با ID
- در ابتدا تست فیل می‌شود، پس از تکمیل کد پاس می‌شود:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/b170b15f-9cc1-4d1e-b24e-bf8c45c57732)
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/02292009-10db-4469-89af-c3f15939907b)

#### جستجو با name
- در ابتدا تست فیل می‌شود، پس از تکمیل کد پاس می‌شود:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/473b8939-9735-4d6d-b474-f162d247e970)
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/9328909e-0118-4a2b-8106-3edc5a4281c8)

### فرایند نوشتن تست و پیاده‌سازی توابع جستجو دانش‌آموز توسط علی:
#### جستجو با ID
- در ابتدا تست فیل می‌شود، پس از تکمیل کد پاس می‌شود:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/6f12744d-7c95-4296-9251-9ab133d8ee17)
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/34d09dd0-b565-437d-bd44-ee72052bb149)

#### جستجو با title
- در ابتدا تست فیل می‌شود، پس از تکمیل کد پاس می‌شود:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/ddaad5a8-30a8-4a79-9996-78571c240525)
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/d1a8e8c8-e9f0-46f6-9978-b1952eac1bca)

#### جستجو با author
- در ابتدا تست فیل می‌شود، پس از تکمیل کد پاس می‌شود:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/ac93d5df-8af1-45ff-bef3-6bc895956f19)
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/5b02a564-6c24-41dd-8c51-173cb69609b1)

#### درخواست pull request:
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/217dbfa0-7b34-4b24-b4d5-b62cb12d1d55)
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/a74ec037-7c2e-45f9-b550-ae16cdff7f6a)

### پاس شدن تست ها و اتمام وظایف
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/d8e5fdd3-2d0c-4c0c-8db5-a41e8502c549)
- ![image](https://github.com/seftaz/Experiment-TDD/assets/79265096/f999109a-e956-4598-8c8c-dd053fcb7698)

## پاسخ به سوالات
## سوال اول: رویکردهای تست نرم‌افزار

### روش TDD
**در TDD، تست‌ها پیش از نوشتن کد اصلی نرم‌افزار نوشته می‌شوند.** فرایند شامل نوشتن تست، نوشتن کد برای پاس کردن تست، و سپس بازنویسی کد برای بهبود و اصلاح است.

#### مناسب برای پروژه‌های که:
- نیاز به تغییرات مکرر دارند.
- پیچیدگی منطقی بالایی دارند و احتمال خطا در آن‌ها زیاد است.
- تمرکز بر کیفیت و پایداری بلندمدت دارند.
- توسعه به صورت تیمی و تعاملی است که نیاز به فهم مشترک از کد دارد.

### روش تست سنتی
**در روش سنتی، تست‌ها پس از نوشتن کد نرم‌افزار نوشته می‌شوند.** این رویکرد بیشتر برای بررسی نرم‌افزار بعد از تکمیل توسعه تمرکز می‌کند.

#### مناسب برای پروژه‌های که:
- مشخصات و نیازمندی‌ها به ندرت تغییر می‌کنند.
- منابع محدودی دارند و نمی‌توانند تست‌ها را دوره‌ای اجرا کنند.
- تاکید بر تست‌های کاربردی و عملکردی بیش از Unit Test هاست.


## سوال دوم: نقش تیم‌ها در تست نرم‌افزار

### Development Team
این تیم بیشتر با **یونیت تست** سروکار دارد. یونیت تست روی بررسی کوچک‌ترین قسمت‌های قابل تست یک برنامه (مثل توابع) تمرکز می‌کند. در TDD، این تست‌ها قبل از نوشتن کد نوشته می‌شوند.

### QA Team
این تیم معمولاً بیشتر با **Acceptance Test، Integration Tests، و System Tests** سروکار دارد. این تست‌ها روی بررسی نرم‌افزار از نظر ذی‌نفعان و اطمینان از اینکه تمامی قسمت‌های نرم‌افزار به درستی با یکدیگر کار می‌کنند، تمرکز دارند.

## انواع تست

- **Unit Testing**: جزئی‌ترین بخش‌های قابل اجرای کد.
- **Integration Testing**: تعامل بین ماژول‌ها یا قسمت‌های مختلف نرم‌افزار و کارکرد صحیح آن‌ها با یکدیگر.
- **System Testing**: بررسی کامل نرم‌افزار در محیطی شبیه‌سازی شده و اطمینان از رفتار مناسب سیستم.
- **Acceptance Testing**: انجام تست‌ها با هدف اطمینان از رفع نیازهای کاربران نهایی و ذی‌نفعان پروژه.
