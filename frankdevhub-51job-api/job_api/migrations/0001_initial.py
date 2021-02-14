# Generated by Django 3.1.6 on 2021-02-14 05:31

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='PlatformDataJson',
            fields=[
                ('id', models.CharField(max_length=64, primary_key=True, serialize=False)),
                ('create_time', models.PositiveIntegerField()),
                ('update_time', models.PositiveIntegerField()),
                ('type', models.CharField(max_length=50)),
                ('jt', models.PositiveIntegerField()),
                ('tags', models.CharField(max_length=100)),
                ('ad_track', models.CharField(max_length=50)),
                ('job_id', models.CharField(max_length=50)),
                ('coid', models.CharField(max_length=20)),
                ('effect', models.PositiveIntegerField()),
                ('is_special_job', models.CharField(max_length=5)),
                ('job_href', models.CharField(max_length=100)),
                ('job_name', models.CharField(max_length=100)),
                ('job_title', models.CharField(max_length=100)),
                ('company_href', models.CharField(max_length=100)),
                ('company_name', models.CharField(max_length=100)),
                ('provide_salary_text', models.CharField(max_length=100)),
                ('work_area', models.CharField(max_length=50)),
                ('work_area_text', models.CharField(max_length=100)),
                ('update_date', models.CharField(max_length=50)),
                ('is_intern', models.CharField(max_length=5)),
                ('is_communicate', models.CharField(max_length=5)),
                ('company_type_text', models.CharField(max_length=100)),
                ('degree_from', models.PositiveIntegerField()),
                ('work_year', models.PositiveIntegerField()),
                ('issue_date', models.CharField(max_length=50)),
                ('is_from_xyz', models.CharField(max_length=5)),
                ('jobwelf', models.CharField(max_length=100)),
                ('jobwelf_list', models.CharField(max_length=100)),
                ('attribute_text', models.CharField(max_length=100)),
                ('company_size_text', models.CharField(max_length=100)),
                ('company_ind_text', models.CharField(max_length=100)),
                ('adid', models.CharField(max_length=10)),
                ('content', models.TextField()),
            ],
            options={
                'abstract': False,
            },
        ),
    ]