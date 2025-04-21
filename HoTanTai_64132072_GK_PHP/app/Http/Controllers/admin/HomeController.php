<?php

namespace App\Http\Controllers\admin;

use App\Http\Controllers\Controller;
use App\Models\Page;
use App\Models\Post;
use App\Models\Student;
use App\Models\Topic;
use Illuminate\Http\Request;

class HomeController extends Controller
{
    public function index()
    {
        $totalTopic = Topic::count();
        $totalStudent = Student::count();

        return view('admin.dashboard', [
            'totalTopic' => $totalTopic,
            'totalStudent' => $totalStudent,
        ]);
    }
}
